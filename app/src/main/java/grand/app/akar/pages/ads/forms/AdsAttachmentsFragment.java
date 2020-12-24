package grand.app.akar.pages.ads.forms;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Objects;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.connection.FileObject;
import grand.app.akar.databinding.FragmentAdsAttachmentsBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.ads.models.OrderImages;
import grand.app.akar.pages.ads.viewModels.AttachmentsViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.upload.FileOperations;

public class AdsAttachmentsFragment extends BaseFragment {
    private Context context;
    @Inject
    AttachmentsViewModel viewModel;
    private int imagePosition;
    FragmentAdsAttachmentsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ads_attachments, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setCreateAdRequest(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CreateAdRequest.class));
        }
        viewModel.setUpAdImages();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.PICK_VIDEO:
                    pickVideo();
                    break;
                case Constants.REMOVE_VIDEO:
                    binding.image7.setImageDrawable(getResources().getDrawable(R.color.colorPrimaryDark, null));
                    break;
                case Constants.CREATE_AD:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    MovementHelper.startActivity(context, AdUploadingSuccessFragment.class.getName(), getString(R.string.add_success_added), null);
                    MovementHelper.finishWithResult(viewModel.getPassingObject(), context);
                    break;
                case Constants.WARNING:
                    showError(getString(R.string.image_required));
                    break;
            }
        });
        viewModel.getImagesAdapter().getNewImageLiveData().observe(((LifecycleOwner) context), integer -> {
            imagePosition = integer;
            pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) context).enableRefresh(false);
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGES, Constants.FILE_TYPE_IMAGE);
            viewModel.getImagesAdapter().orderImagesList.set(imagePosition, new OrderImages(fileObject.getFilePath()));
            viewModel.getImagesAdapter().notifyDataSetChanged();
        } else if (requestCode == Constants.FILE_TYPE_VIDEO) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.VIDEO, Constants.FILE_TYPE_VIDEO);
            if (fileObject.getFilePath() != null) {
                File file = new File(fileObject.getFilePath());
                if (videoTime(file) <= 30 && Integer.parseInt(String.valueOf((file.length() / 1024) / 1024)) <= 60) {
                    Bitmap thumb = ThumbnailUtils.createVideoThumbnail(fileObject.getFilePath(),
                            MediaStore.Images.Thumbnails.MINI_KIND);
                    binding.image7.setImageBitmap(thumb);
                    viewModel.setFileObjectVideo(fileObject);
                } else
                    showError(getString(R.string.videoBig));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private long videoTime(File videoFile) {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
//use one of overloaded setDataSource() functions to set your data source
        retriever.setDataSource(context, Uri.fromFile(videoFile));
        String time = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
        long timeInMillisec = Long.parseLong(time);
        long sec = timeInMillisec / 1000;
        retriever.release();
        return sec;
    }
}
