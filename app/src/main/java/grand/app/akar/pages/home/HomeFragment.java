package grand.app.akar.pages.home;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import org.jetbrains.annotations.NotNull;
import java.util.Objects;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentHomeBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

public class HomeFragment extends BaseFragment {

    private Context context;
    @Inject
    HomeViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.HOME)) {
                if (((HomeResponse) (mutable).object).getData().getFiles_completed() == 0)
                    showDocsWarningDialog();
                else
                    viewModel.getHomeAdapter().update(((HomeResponse) (mutable).object).getData().getHomeDataList());
            }
        });
        ((BaseActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> initLastLocation());
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
        initLastLocation();
    }

    public void initLastLocation() {
        FusedLocationProviderClient fusedLocationClient = LocationServices.getFusedLocationProviderClient(context);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(((Activity) context), location -> {
                    if (location != null) {
                        baseActivity().stopRefresh(false);
                        viewModel.getHome(location.getLatitude() + "&lng=" + location.getLongitude() + "&search_key=");
                    }
                });

    }

    private void showDocsWarningDialog() {
        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
//        WarningDocumentExpiredBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.warning_document_expired, null, false);
//        dialog.setContentView(binding.getRoot());
//        binding.setViewModel(viewModel);
//        binding.sendFeedBack.setOnClickListener(v -> MovementHelper.startActivity(context, DocumentsFragment.class.getName(), getResources().getString(R.string.tv_account_upload_documents), null));
        dialog.show();
    }
}
