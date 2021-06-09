package te.app.evidence.pages.cases;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
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
import te.app.evidence.databinding.FragmentCaseDetailsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetailsResponse;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class CaseDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    CasesViewModel viewModel;
    FragmentCaseDetailsBinding binding;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_case_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.caseDetailsResponse();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_DETAILS.equals(((Mutable) o).message)) {
                viewModel.setCaseDetails(((CaseDetailsResponse) mutable.object).getCaseDetails());
            } else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
                //TODO Add client or khesm no api allowed and delete client
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getSelectedBtn()), getString(R.string.add_new_client), AddClientToCaseFragment.class.getName(), Constants.ADD_CLIENT_REQUEST);
            } else if (Constants.EDIT_CASE.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails()), getString(R.string.edit_case), EditCaseFragment.class.getName(), Constants.EDIT_CASE_REQUEST);
            } else if (Constants.CASE_SESSIONS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails()), getString(R.string.edit_case), EditCaseFragment.class.getName(), Constants.EDIT_CASE_REQUEST);
            } else if (Constants.LOOPER.equals(((Mutable) o).message)) {
                binding.progressBarHome.setVisibility(View.VISIBLE);
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    binding.progressBarHome.setVisibility(View.GONE);
                    if (viewModel.getSelectedBtn() == 0)
                        viewModel.getClientsAdapter().update(viewModel.getCaseDetails().getClients());
                    else if (viewModel.getSelectedBtn() == 1)
                        viewModel.getClientsAdapter().update(viewModel.getCaseDetails().getKhesm());
                    viewModel.notifyChange(BR.clientsAdapter);
                }, 1000);
            }

        });
//        viewModel.getNotesAdapter().actionLiveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
//        deleteDialog = new Dialog(context, R.style.PauseDialog);
//        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
//        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
//        deleteDialog.setContentView(binding.getRoot());
//        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
//        binding.optionDone.setOnClickListener(v -> viewModel.deleteNote());
//        deleteDialog.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
//                    if (viewModel.getNotesAdapter().lastSelected == -1) {
//                        viewModel.getNotesAdapter().getNotesList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Notes.class));
//                        viewModel.getNotesAdapter().notifyItemInserted(viewModel.getNotesAdapter().getNotesList().size() - 1);
//                        binding.rcNotes.scrollToPosition(viewModel.getNotesAdapter().getNotesList().size() - 1);
//                    } else {
//                        viewModel.getNotesAdapter().getNotesList().set(viewModel.getNotesAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Notes.class));
//                        viewModel.getNotesAdapter().notifyItemChanged(viewModel.getNotesAdapter().lastSelected);
//                        binding.rcNotes.scrollToPosition(viewModel.getNotesAdapter().lastSelected);
//                    }
                }
            }
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
