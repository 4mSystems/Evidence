package te.app.evidence.pages.notes;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAddNoteBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.notes.models.AddNoteResponse;
import te.app.evidence.pages.notes.models.Notes;
import te.app.evidence.pages.notes.viewModels.AddNoteViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class AddNoteFragment extends BaseFragment {

    private Context context;
    @Inject
    AddNoteViewModel viewModel;
    FragmentAddNoteBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_note, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setNotes(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), Notes.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.ADD_NOTE.equals(((Mutable) o).message)) {
                toastMessage(((AddNoteResponse) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(((AddNoteResponse) mutable.object).getNotes()), context);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getNotesRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
