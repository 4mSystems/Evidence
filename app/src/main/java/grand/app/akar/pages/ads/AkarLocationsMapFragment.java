package grand.app.akar.pages.ads;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Task;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.maps.CurrentAddressModel;
import grand.app.akar.base.maps.MapHelper;
import grand.app.akar.databinding.FragmentAkarLocationsMapBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import grand.app.akar.pages.auth.models.cities.CitiesResponse;
import grand.app.akar.pages.settings.models.AboutResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;

public class AkarLocationsMapFragment extends BaseFragment implements OnMapReadyCallback {
    private Context context;
    @Inject
    AdsViewModel viewModel;
    GoogleMap mMap;
    FragmentAkarLocationsMapBinding binding;
    MapHelper mapHelper;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_akar_locations_map, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.cities();
        init(savedInstanceState);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.CITIES)) {
                viewModel.setCitiesList(((CitiesResponse) mutable.object).getCitiesList());
                mapHelper.addMarker(new LatLng(Double.parseDouble(viewModel.getCitiesList().get(0).getLat()), Double.parseDouble(viewModel.getCitiesList().get(0).getLng()) ), false);
            } else if (mutable.message.equals(Constants.CHOOSE_CITY)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getResources().getString(R.string.choose_akar_locations), AkarLocationsCitiesFragment.class.getName(), null);
            }
        });
        getActivityBase().connectionMutableLiveData.observe(((LifecycleOwner) context), isConnected -> {
            if (isConnected)
                viewModel.cities();
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    CurrentAddressModel currentAddressModel = (CurrentAddressModel) bundle.getSerializable(Constants.BUNDLE);
                    if (currentAddressModel != null) {
                        binding.inputSearch.setText(currentAddressModel.getUserAddress());
                        mapHelper.addMarker(new LatLng(currentAddressModel.getLat(), currentAddressModel.getLng()), false);
                    }
                }
            }
        }
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mapHelper = new MapHelper(mMap, context);
    }

    private void init(Bundle savedInstanceState) {
        binding.mapview.onCreate(savedInstanceState);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((AppCompatActivity) context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
            mapHelper.enableLocationDialog();
        } else {
            binding.mapview.getMapAsync(this);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        binding.mapview.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding.mapview.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        binding.mapview.onLowMemory();
    }

    @Override
    public void onResume() {
        binding.mapview.onResume();
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        binding.mapview.getMapAsync(this);
        binding.mapview.onResume();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
