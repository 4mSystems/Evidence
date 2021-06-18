package te.app.evidence.pages.attachments.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.attachments.models.Attachment;

public class AttachmentsItemViewModel extends BaseViewModel {
    public Attachment attachment;

    public AttachmentsItemViewModel(Attachment attachment) {
        this.attachment = attachment;
    }

    @Bindable
    public Attachment getAttachment() {
        return attachment;
    }


}
