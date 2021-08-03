package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.attachments.models.AddAttachmentRequest;
import te.app.evidence.pages.attachments.models.AddAttachmentResponse;
import te.app.evidence.pages.attachments.models.AttachmentsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class AttachmentsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public AttachmentsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getAttachments(String type, int id, int page, boolean showProgress) {
        if (type.equals(Constants.CASE_ATTACHMENTS))
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_ATTACHMENTS + id + "?page=" + page, new Object(), AttachmentsResponse.class,
                    Constants.CASE_ATTACHMENTS, showProgress);
        else
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CLIENT_ATTACHMENTS + id + "?page=" + page, new Object(), AttachmentsResponse.class,
                    Constants.CASE_ATTACHMENTS, showProgress);
    }

    public Disposable deleteAttachment(int attachId, String type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, type.equals(Constants.CASE_ATTACHMENTS) ? URLS.DELETE_CASE_ATTACHMENT + attachId : URLS.DELETE_ATTACHMENT + attachId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable addAttachment(AddAttachmentRequest attachmentRequest, List<FileObject> fileObjects) {
        return connectionHelper.requestApi(attachmentRequest.getCaseId() != null ? URLS.ADD_CASE_ATTACHMENT : URLS.ADD_CLIENT_ATTACHMENT, attachmentRequest, fileObjects, AddAttachmentResponse.class,
                Constants.ADD_ATTACH, false);
    }
}