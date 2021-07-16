package te.app.evidence.pages.sessions;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentSessionNotesBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.notes.AddNoteFragment;
import te.app.evidence.pages.clients.notes.models.Notes;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.sessions.models.SessionNotesResponse;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;

public class SessionNotesFragment extends BaseFragment {
    FragmentSessionNotesBinding binding;
    @Inject
    SessionNotesViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_session_notes, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.sessionNotes(1, true);
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.SESSION_NOTES.equals(((Mutable) o).message)) {
                viewModel.setNotesMainData(((SessionNotesResponse) mutable.object).getNotesMainData());
            } else if (Constants.CHANGE_STATUS.equals(((Mutable) o).message)) {
                toastMessage(((ChangeStatusResponse) mutable.object).mMessage);
                viewModel.getNotesAdapter().getNotesList().get(viewModel.getNotesAdapter().lastSelected).setStatus(((ChangeStatusResponse) mutable.object).getStatus());
                viewModel.getNotesAdapter().notifyItemChanged(viewModel.getNotesAdapter().lastSelected);
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getNotesAdapter().getNotesList().remove(viewModel.getNotesAdapter().lastSelected);
                viewModel.getNotesAdapter().notifyDataSetChanged();
                deleteDialog.dismiss();

            } else if (Constants.ADD_NOTE.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId(), Constants.SESSION_NOTES),
                        getString(R.string.add_new_note),
                        AddNoteFragment.class.getName(), null);
            }
        });

        viewModel.getNotesAdapter().actionLiveData.observe(requireActivity(), o -> {
            if (o.equals(Constants.CHANGE_STATUS))
                viewModel.changeStatus();
            else if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
        binding.rcNotes.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getNotesMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getNotesAdapter().getNotesList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.sessionNotes((viewModel.getNotesMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deleteSessionNote());
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
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }
}
