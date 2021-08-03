package te.app.evidence.pages.attachments.viewModels;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.models.AddAttachmentRequest;
import te.app.evidence.repository.AttachmentsRepository;
import te.app.evidence.utils.Constants;

public class AddAttachmentViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AddAttachmentRequest attachmentRequest;
    @Inject
    AttachmentsRepository attachmentsRepository;
    List<FileObject> fileObjects;

    @Inject
    public AddAttachmentViewModel(AttachmentsRepository attachmentsRepository) {
        fileObjects = new ArrayList<>();
        this.attachmentsRepository = attachmentsRepository;
        this.liveData = new MutableLiveData<>();
        attachmentsRepository.setLiveData(liveData);
        attachmentRequest = new AddAttachmentRequest();


    }

    public void addAttach() {
        if (getPassingObject().getObject().equals(Constants.CASE_ATTACHMENTS))
            getAttachmentRequest().setCaseId(String.valueOf(getPassingObject().getId()));
        else
            getAttachmentRequest().setClientId(String.valueOf(getPassingObject().getId()));
        if (getAttachmentRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(attachmentsRepository.addAttachment(getAttachmentRequest(), getFileObjects()));
        }
    }

    public void select() {
        liveData.setValue(new Mutable(Constants.SELECT));
    }

    public AddAttachmentRequest getAttachmentRequest() {
        return attachmentRequest;
    }

    public AttachmentsRepository getAttachmentsRepository() {
        return attachmentsRepository;
    }

    public List<FileObject> getFileObjects() {
        return fileObjects;
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
