package te.app.evidence.pages.reports;


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

import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentMonthlyReportsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.pages.reports.models.ReportsResponse;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;

public class MonthlyReportsFragment extends BaseFragment {
    FragmentMonthlyReportsBinding binding;
    @Inject
    ReportsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_monthly_reports, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCasesClientsCategories();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.setCategoriesDataList(((CategoriesResponse) mutable.object).getMainData().getCategoriesDataList());
            } else if (Constants.SHOW_CATEGORIES.equals(((Mutable) o).message)) {
                showCategories();
            } else if (Constants.REPORT.equals(((Mutable) o).message)) {
                viewModel.setReportsMain(((ReportsResponse) mutable.object).getReportsMain());
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
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getReportsMain().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getReportsAdapter().getReportsDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.getReports((viewModel.getReportsMain().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showCategories() {
        PopUpMenuHelper.showCategoriesPopUp(requireActivity(), binding.inputCat, viewModel.getCategoriesDataList()).
                setOnMenuItemClickListener(item -> {
                    binding.inputCat.setText(viewModel.getCategoriesDataList().get(item.getItemId()).getName());
                    viewModel.getSearchReportRequest().setCategory_id(viewModel.getCategoriesDataList().get(item.getItemId()).getId());
                    return false;
                });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getReportsRepository().setLiveData(viewModel.liveData);
    }

}
