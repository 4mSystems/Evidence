package te.app.evidence.pages.attachments.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.repository.AttachmentsRepository;

public class AttachmentsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AttachmentsRepository attachmentsRepository;

    @Inject
    public AttachmentsViewModel(AttachmentsRepository attachmentsRepository) {
        this.attachmentsRepository = attachmentsRepository;
        this.liveData = new MutableLiveData<>();
        attachmentsRepository.setLiveData(liveData);
    }

    public void attachments() {
        compositeDisposable.add(attachmentsRepository.getAttachments());
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
