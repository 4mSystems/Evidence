package te.app.evidence.pages.cases;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;


import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.activity.BaseActivity;
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
    private Context context;
    @Inject
    CasesViewModel viewModel;

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
        });
        ((BaseActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.cases();
            ((BaseActivity) context).stopRefresh(false);
        });
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
