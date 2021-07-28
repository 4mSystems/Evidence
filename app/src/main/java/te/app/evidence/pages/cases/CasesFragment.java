package te.app.evidence.pages.cases;

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
import te.app.evidence.databinding.FragmentCasesBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.cases.AllCasesResponse;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;
import te.app.evidence.utils.Constants;

public class CasesFragment extends BaseFragment {
    FragmentCasesBinding binding;
    @Inject
    CasesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cases, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.cases(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.ALL_CASES.equals(((Mutable) o).message)) {
                viewModel.setCasesMainData(((AllCasesResponse) mutable.object).getData());
            } else if (Constants.SEARCH.equals(((Mutable) o).message)) {
                viewModel.setCasesMainData(((AllCasesResponse) mutable.object).getData());
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
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getCasesMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getCasesAdapter().getCasesList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        if (TextUtils.isEmpty(viewModel.searchRequest.getSearch()))
                            viewModel.cases((viewModel.getCasesMainData().getCurrentPage() + 1), false);
                        else
                            viewModel.search((viewModel.getCasesMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }

}
