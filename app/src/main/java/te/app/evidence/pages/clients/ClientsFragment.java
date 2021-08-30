package te.app.evidence.pages.clients;

import android.app.Dialog;
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
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;


import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentClientsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class ClientsFragment extends BaseFragment {
    FragmentClientsBinding binding;
    @Inject
    ClientsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clients, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.clients(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                viewModel.setClientsMainData(((ClientsResponse) mutable.object).getClientsMainData());
            } else if (Constants.SEARCH.equals(((Mutable) o).message)) {
                viewModel.setClientsMainData(((ClientsResponse) mutable.object).getClientsMainData());
            } else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
                viewModel.getClientsAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.add_new_client), AddClientFragment.class.getName(), null);
            } else if (Constants.DELETE_CLIENT.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getClientsAdapter().getClientsList().remove(viewModel.getClientsAdapter().lastSelected);
                viewModel.getClientsAdapter().notifyDataSetChanged();
                viewModel.notifyChange(BR.clientsAdapter);
            }
        });

        viewModel.getClientsAdapter().actionLiveData.observe(requireActivity(), o -> showDeleteDialog());
        binding.rcClients.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getClientsMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getClientsAdapter().getClientsList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        if (TextUtils.isEmpty(viewModel.searchRequest.getName()))
                            viewModel.clients((viewModel.getClientsMainData().getCurrentPage() + 1), false);
                        else
                            viewModel.search((viewModel.getClientsMainData().getCurrentPage() + 1), false);
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
        binding.optionDone.setOnClickListener(v -> {
            deleteDialog.dismiss();
            viewModel.deleteClient();
        });
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
                    if (viewModel.getClientsAdapter().lastSelected == -1) {
                        viewModel.getClientsAdapter().getClientsList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Clients.class));
                        viewModel.getClientsAdapter().notifyItemInserted(viewModel.getClientsAdapter().getClientsList().size() - 1);
                        binding.rcClients.scrollToPosition(viewModel.getClientsAdapter().getClientsList().size() - 1);
                    } else {
                        viewModel.getClientsAdapter().getClientsList().set(viewModel.getClientsAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Clients.class));
                        viewModel.getClientsAdapter().notifyItemChanged(viewModel.getClientsAdapter().lastSelected);
                        binding.rcClients.scrollToPosition(viewModel.getClientsAdapter().lastSelected);
                    }
                    viewModel.notifyChange(BR.clientsAdapter);
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

}
