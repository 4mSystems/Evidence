package te.app.evidence.pages.notes.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.notes.models.Notes;
import te.app.evidence.utils.Constants;

public class NotesItemViewModel extends BaseViewModel {
    public Notes notes;

    public NotesItemViewModel(Notes notes) {
        this.notes = notes;
    }

    @Bindable
    public Notes getNotes() {
        return notes;
    }

    public void toEdit() {
        getLiveData().setValue(Constants.EDIT);
    }

    public void toDelete() {
        getLiveData().setValue(Constants.DELETE);
    }

    public void toClientProfile() {
        getLiveData().setValue(Constants.CLIENT_PROFILE);
    }

}
