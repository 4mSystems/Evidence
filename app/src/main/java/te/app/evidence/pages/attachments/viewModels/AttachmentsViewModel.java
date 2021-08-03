package te.app.evidence.pages.attachments.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.adapters.AttachmentsAdapter;
import te.app.evidence.pages.attachments.models.AttachmentsMainData;
import te.app.evidence.repository.AttachmentsRepository;
import te.app.evidence.utils.Constants;

public class AttachmentsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AttachmentsRepository attachmentsRepository;
    AttachmentsAdapter attachmentsAdapter;
    AttachmentsMainData mainData;

    @Inject
    public AttachmentsViewModel(AttachmentsRepository attachmentsRepository) {
        this.attachmentsRepository = attachmentsRepository;
        this.liveData = new MutableLiveData<>();
        attachmentsRepository.setLiveData(liveData);
        mainData = new AttachmentsMainData();
    }

    public void attachments(int page, boolean showProgress) {
        compositeDisposable.add(attachmentsRepository.getAttachments(getPassingObject().getObject(), getPassingObject().getId(), page, showProgress));
    }

    public void deleteAttachments() {
        compositeDisposable.add(attachmentsRepository.deleteAttachment(getAttachmentsAdapter().getAttachmentList().get(getAttachmentsAdapter().lastSelected).getId(), getPassingObject().getObject()));
    }

    public void toAttach() {
        liveData.setValue(new Mutable(Constants.ADD_ATTACH));
    }

    @Bindable
    public AttachmentsAdapter getAttachmentsAdapter() {
        return this.attachmentsAdapter == null ? this.attachmentsAdapter = new AttachmentsAdapter() : this.attachmentsAdapter;
    }

    public AttachmentsMainData getMainData() {
        return mainData;
    }

    public void setMainData(AttachmentsMainData mainData) {
        if (getAttachmentsAdapter().getAttachmentList().size() > 0) {
            getAttachmentsAdapter().loadMore(mainData.getAttachmentList());
        } else {
            getAttachmentsAdapter().update(mainData.getAttachmentList());
            notifyChange(BR.attachmentsAdapter);
        }
        searchProgressVisible.set(false);
        this.mainData = mainData;
    }

    public AttachmentsRepository getAttachmentsRepository() {
        return attachmentsRepository;
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
}
