package grand.app.akar.pages.ads.viewModels;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.adDetails.models.SliderItem;
import grand.app.akar.pages.adDetails.models.UpdatedImagesRequest;
import grand.app.akar.pages.ads.adapter.AdImagesAdapter;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.ads.models.OrderImages;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class AttachmentsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository repository;
    AdImagesAdapter imagesAdapter;
    private List<FileObject> fileObjectList;
    private FileObject fileObjectVideo;
    private CreateAdRequest createAdRequest;
    private List<SliderItem> sliderItem;

    @Inject
    public AttachmentsViewModel(AdsRepository repository) {
        sliderItem = new ArrayList<>();
        createAdRequest = new CreateAdRequest();
        fileObjectVideo = new FileObject();
        fileObjectList = new ArrayList<>();
        imagesAdapter = new AdImagesAdapter();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public AdsRepository getRepository() {
        return repository;
    }

    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    public void setCreateAdRequest(CreateAdRequest createAdRequest) {
        this.createAdRequest = createAdRequest;
    }

    public void setUpAdImages() {
        int sliderCounter = 0;
        List<OrderImages> orderImages = new ArrayList<>();
        orderImages.add(new OrderImages(""));
        orderImages.add(new OrderImages(""));
        orderImages.add(new OrderImages(""));
        orderImages.add(new OrderImages(""));
        orderImages.add(new OrderImages(""));
        orderImages.add(new OrderImages(""));
        if (getSliderItem().size() > 0) {
            for (int i = 0; i < getSliderItem().size(); i++) {
                if (getSliderItem().get(i).getType() == 0) {
                    orderImages.set(sliderCounter, new OrderImages(getSliderItem().get(i).getMedia(), true, getSliderItem().get(i).getId()));
                    sliderCounter++;
                }
            }
        }
        getImagesAdapter().update(orderImages);
    }

    public AdImagesAdapter getImagesAdapter() {
        return imagesAdapter;
    }

    public void pickVideo() {
        liveData.setValue(new Mutable(Constants.PICK_VIDEO));
    }

    public void uploadAd() {
        int counter = 0;
        fileObjectList.clear();
        for (int i = 0; i < getImagesAdapter().orderImagesList.size(); i++) {
            if (!getImagesAdapter().orderImagesList.get(i).getPath().isEmpty()) {
                FileObject fileObject = new FileObject("imgs[" + counter + "]", getImagesAdapter().orderImagesList.get(i).getPath(), Constants.FILE_TYPE_IMAGE);
                fileObjectList.add(fileObject);
                counter++;
            }
            if (i == getImagesAdapter().orderImagesList.size() - 1) {
                if (getFileObjectList().size() > 0) {
                    if (!TextUtils.isEmpty(getFileObjectVideo().getFilePath()))
                        fileObjectList.add(getFileObjectVideo());
                    compositeDisposable.add(repository.createAd(getCreateAdRequest(), getFileObjectList()));
                } else
                    liveData.setValue(new Mutable(Constants.WARNING));
            }
        }

    }

    public void updateImages() {
        int counter = 0;
        fileObjectList.clear();
        for (int i = 0; i < getImagesAdapter().orderImagesList.size(); i++) {
            if (!getImagesAdapter().orderImagesList.get(i).getPath().isEmpty() && getImagesAdapter().orderImagesList.get(i).getId() == 0) {
                FileObject fileObject = new FileObject("imgs[" + counter + "]", getImagesAdapter().orderImagesList.get(i).getPath(), Constants.FILE_TYPE_IMAGE);
                fileObjectList.add(fileObject);
                counter++;
            }
            if (i == getImagesAdapter().orderImagesList.size() - 1) {
                if (getFileObjectList().size() > 0) {
                    if (!TextUtils.isEmpty(getFileObjectVideo().getFilePath()))
                        fileObjectList.add(getFileObjectVideo());
                    Log.e("updateImages", "updateImages: "+ getImagesAdapter().getDeletedIdsList().toString());
                    compositeDisposable.add(repository.updateAdImages(new UpdatedImagesRequest(getImagesAdapter().getDeletedIdsList().toString(), getPassingObject().getId()), getFileObjectList()));
                } else
                    liveData.setValue(new Mutable(Constants.WARNING));
            }
        }

    }

    public void removeVideo() {
        setFileObjectVideo(new FileObject());
        liveData.setValue(new Mutable(Constants.REMOVE_VIDEO));
    }

    public List<FileObject> getFileObjectList() {
        return fileObjectList;
    }

    @Bindable
    public FileObject getFileObjectVideo() {
        return fileObjectVideo;
    }

    @Bindable
    public void setFileObjectVideo(FileObject fileObjectVideo) {
        notifyChange(BR.fileObjectVideo);
        this.fileObjectVideo = fileObjectVideo;
    }

    @Bindable
    public List<SliderItem> getSliderItem() {
        return sliderItem;
    }

    @Bindable
    public void setSliderItem(List<SliderItem> sliderItem) {
        notifyChange(BR.sliderItem);
        this.sliderItem = sliderItem;
    }
}
