package te.app.evidence.pages.cases;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import te.app.evidence.activity.BaseActivity;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentCasesBinding;
import te.app.evidence.databinding.FragmentClientsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.cases.AllCasesResponse;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class CasesFragment extends BaseFragment {
    FragmentCasesBinding binding;
    private Context context;
    @Inject
    CasesViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cases, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.cases();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.ALL_CASES.equals(((Mutable) o).message)) {
                viewModel.getCasesAdapter().update(((AllCasesResponse) mutable.object).getData());
                viewModel.notifyChange(BR.casesAdapter);
            }
//            else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
//                viewModel.getClientsAdapter().lastSelected = -1;
//                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_new_client), AddClientFragment.class.getName(), null);
//            } else if (Constants.DELETE_CLIENT.equals(((Mutable) o).message)) {
//                toastMessage(((StatusMessage) mutable.object).mMessage);
//                viewModel.getClientsAdapter().getClientsList().remove(viewModel.getClientsAdapter().lastSelected);
//                viewModel.getClientsAdapter().notifyItemRangeChanged(viewModel.getClientsAdapter().lastSelected, viewModel.getClientsAdapter().getItemCount());
//                deleteDialog.dismiss();
//            }
        });
        ((BaseActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.cases();
            ((BaseActivity) context).stopRefresh(false);
        });
//        viewModel.getClientsAdapter().actionLiveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
//        binding.optionDone.setOnClickListener(v -> viewModel.deleteClient());
        deleteDialog.show();
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
