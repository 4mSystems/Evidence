package te.app.evidence.pages.mohdrs;

import android.content.Context;
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
import te.app.evidence.databinding.FragmentReporterDetailsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.mohdrs.models.details.ReporterDetailsResponse;
import te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel;
import te.app.evidence.utils.Constants;


public class ReportersDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    ReportersDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentReporterDetailsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_reporter_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getReportersDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.REPOTERS.equals(((Mutable) o).message)) {
                viewModel.setReportersData(((ReporterDetailsResponse) mutable.object).getData());
            }
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
