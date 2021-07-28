package te.app.evidence.pages.reports;


import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentDailyReportsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.AddClientFragment;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class DailyReportsFragment extends BaseFragment {
    FragmentDailyReportsBinding binding;
    @Inject
    ReportsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daily_reports, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
//        viewModel.clients(1, true);
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
                deleteDialog.dismiss();
            }
        });

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
                        viewModel.clients((viewModel.getClientsMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

}
