package te.app.evidence.pages.cases;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import te.app.evidence.databinding.FragmentCaseDetailsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.attachments.AttachmentsFragment;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetailsResponse;
import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;
import te.app.evidence.pages.sessions.SessionsFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class CaseDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    CasesViewModel viewModel;
    FragmentCaseDetailsBinding binding;

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
                binding.viewId.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getSessionsNumber()), true);
                binding.viewMohdr.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getNotesNumber()), true);
                binding.viewClients.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getClients()), true);
                binding.viewKhesm.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getKhesm()), true);
                binding.viewAttachments.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getAttachmentsNumber()), true);
            } else if (Constants.EDIT_CASE.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails()), getString(R.string.edit_case), EditCaseFragment.class.getName(), Constants.EDIT_CASE_REQUEST);
            } else if (Constants.KHESM.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails().getCaseData().getId(), Constants.khesm), getString(R.string.opponents), CaseClientsFragment.class.getName(), Constants.KHESM_CODE);
            } else if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails().getCaseData().getId(), Constants.client), getString(R.string.clients), CaseClientsFragment.class.getName(), Constants.CLIENTS_CODE);
            } else if (Constants.CASE_SESSIONS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCaseDetails().getCaseData().getId()), getString(R.string.sessions), SessionsFragment.class.getName(), Constants.SESSION_CODE);
            } else if (Constants.CASE_ATTACHMENTS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getCaseDetails().getCaseData().getId(), Constants.CASE_ATTACHMENTS), getString(R.string.attachments), AttachmentsFragment.class.getName(), null);
            }

        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
            if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                if (requestCode == Constants.CLIENTS_CODE) {
                    viewModel.getCaseDetails().getNumbers().setClients(String.valueOf(passingObject.getId()));
                    binding.viewClients.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getClients()), true);
                } else if (requestCode == Constants.KHESM_CODE) {
                    viewModel.getCaseDetails().getNumbers().setKhesm(String.valueOf(passingObject.getId()));
                    binding.viewKhesm.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getClients()), true);
                } else if (requestCode == Constants.SESSION_CODE) {
                    viewModel.getCaseDetails().getNumbers().setSessionsNumber(String.valueOf(passingObject.getId()));
                    binding.viewId.setProgress(Integer.parseInt(viewModel.getCaseDetails().getNumbers().getSessionsNumber()), true);
                } else if (requestCode == Constants.EDIT_CASE_REQUEST) {
                    viewModel.getCaseDetails().setCaseData(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Cases.class));
                }
                viewModel.setCaseDetails(viewModel.getCaseDetails());
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
