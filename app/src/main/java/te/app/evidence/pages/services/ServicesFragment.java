package te.app.evidence.pages.services;


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
import te.app.evidence.databinding.FragmentServicesBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.services.models.ServiceData;
import te.app.evidence.pages.services.models.ServicesResponse;
import te.app.evidence.pages.services.viewModels.ServicesViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

public class ServicesFragment extends BaseFragment {
    FragmentServicesBinding binding;
    @Inject
    ServicesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_services, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getServices(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.ADD_SERVICE:
                    viewModel.getServicesAdapter().lastSelected = -1;
                    MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.add_service), AddServiceFragment.class.getName(), Constants.ADD_SERVICE_REQUEST);
                    break;
                case Constants.SERVICES:
                    viewModel.setServiceMainData(((ServicesResponse) mutable.object).getServiceMainData());
                    break;
                case Constants.DELETE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getServicesAdapter().getServiceDataList().remove(viewModel.getServicesAdapter().lastSelected);
                    viewModel.getServicesAdapter().notifyDataSetChanged();
                    viewModel.notifyChange(BR.servicesAdapter);
                    break;
            }
        });
        binding.rcServices.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getServiceMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getServicesAdapter().getServiceDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.getServices((viewModel.getServiceMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
        viewModel.getServicesAdapter().liveData.observeForever(o -> {
            if (o.equals(Constants.DELETE))
                showDeleteDialog();
            else
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getServicesAdapter().getServiceDataList().get(viewModel.getServicesAdapter().lastSelected)), getString(R.string.edit_service), AddServiceFragment.class.getName(), Constants.ADD_SERVICE_REQUEST);
        });
    }

    private void showDeleteDialog() {
        Dialog deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> {
            deleteDialog.dismiss();
            viewModel.deleteService();
        });
        deleteDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null) {
            if (request == Constants.ADD_SERVICE_REQUEST) {
                Bundle bundle = result.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getServicesAdapter().lastSelected == -1) {
                        viewModel.getServicesAdapter().getServiceDataList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ServiceData.class));
                        viewModel.getServicesAdapter().notifyItemInserted(viewModel.getServicesAdapter().getServiceDataList().size() - 1);
                        binding.rcServices.scrollToPosition(viewModel.getServicesAdapter().getServiceDataList().size() - 1);
                    } else {
                        ServiceData serviceData = new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ServiceData.class);
                        viewModel.getServicesAdapter().getServiceDataList().set(viewModel.getServicesAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ServiceData.class));
                        viewModel.getServicesAdapter().notifyItemChanged(viewModel.getServicesAdapter().lastSelected);
                        binding.rcServices.scrollToPosition(viewModel.getServicesAdapter().lastSelected);
                    }
                }
            }
        }
    }
}
