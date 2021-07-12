package te.app.evidence.pages.clients;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentClientProfileBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.clientProfile.ClientProfileResponse;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel;
import te.app.evidence.pages.clients.notes.AddNoteFragment;
import te.app.evidence.pages.clients.notes.models.Notes;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class ClientProfileFragment extends BaseFragment {

    private Context context;
    @Inject
    ClientProfileViewModel viewModel;
    FragmentClientProfileBinding binding;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_client_profile, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setClients(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), Clients.class));
            viewModel.clientProfile();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CLIENT_PROFILE.equals(((Mutable) o).message)) {
                viewModel.setClientProfileData(((ClientProfileResponse) mutable.object).getClientProfileData());
            } else if (Constants.ADD_NOTE.equals(((Mutable) o).message)) {
                viewModel.getNotesAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getClients().getClientId()), getString(R.string.add_new_note), AddNoteFragment.class.getName(), null);
            } else if (Constants.DELETE_NOTE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getNotesAdapter().getNotesList().remove(viewModel.getNotesAdapter().lastSelected);
                viewModel.getNotesAdapter().notifyItemRemoved(viewModel.getNotesAdapter().lastSelected);
                deleteDialog.dismiss();
            } else if (Constants.LOOPER.equals(((Mutable) o).message)) {
                binding.progressBarHome.setVisibility(View.VISIBLE);
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    binding.progressBarHome.setVisibility(View.GONE);
                    if (viewModel.getSelectedBtn() == 0)
                        viewModel.getNotesAdapter().update(viewModel.getClientProfileData().getClientNotes());
                    else if (viewModel.getSelectedBtn() == 1)
                        viewModel.getClientCasesAdapter().update(viewModel.getClientProfileData().getCases());
                    viewModel.notifyChange(BR.notesAdapter);
                    viewModel.notifyChange(BR.clientCasesAdapter);
                }, 1000);
            }

        });
        viewModel.getNotesAdapter().actionLiveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deleteNote());
        deleteDialog.show();
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getNotesAdapter().lastSelected == -1) {
                        viewModel.getNotesAdapter().getNotesList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Notes.class));
                        viewModel.getNotesAdapter().notifyItemInserted(viewModel.getNotesAdapter().getNotesList().size() - 1);
                        binding.rcNotes.scrollToPosition(viewModel.getNotesAdapter().getNotesList().size() - 1);
                    } else {
                        viewModel.getNotesAdapter().getNotesList().set(viewModel.getNotesAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Notes.class));
                        viewModel.getNotesAdapter().notifyItemChanged(viewModel.getNotesAdapter().lastSelected);
                        binding.rcNotes.scrollToPosition(viewModel.getNotesAdapter().lastSelected);
                    }
                }
            }
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
