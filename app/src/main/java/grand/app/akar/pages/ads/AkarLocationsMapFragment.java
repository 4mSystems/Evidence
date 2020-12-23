package grand.app.akar.pages.ads;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.maps.MapAddress;
import grand.app.akar.base.maps.MapAddressInterface;
import grand.app.akar.base.maps.MapHelper;
import grand.app.akar.databinding.FragmentAkarLocationsMapBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.pages.auth.models.cities.CitiesResponse;
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
                binding.inputSearch.setText(viewModel.getCitiesList().get(0).getName());
                mapHelper.addMarker(new LatLng(Double.parseDouble(viewModel.getCitiesList().get(0).getLat()), Double.parseDouble(viewModel.getCitiesList().get(0).getLng())), false);
            } else if (mutable.message.equals(Constants.CHOOSE_CITY)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCitiesList()), getResources().getString(R.string.choose_akar_locations), AkarLocationsCitiesFragment.class.getName(), null);
            } else if (mutable.message.equals(Constants.CATEGORIES)) {
                binding.addressProgress.setVisibility(View.VISIBLE);
                new MapHelper(context).getAddress(Double.parseDouble(viewModel.getCreateAdRequest().getLat()), Double.parseDouble(viewModel.getCreateAdRequest().getLat()), address -> {
                    viewModel.getCreateAdRequest().setAddress(address);
                    MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCreateAdRequest()), getResources().getString(R.string.choose_akar_category), CategoriesFragment.class.getName(), null);
                    binding.addressProgress.setVisibility(View.GONE);
                });
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
                    Cities cities = (Cities) bundle.getSerializable(Constants.BUNDLE);
                    if (cities != null) {
                        binding.inputSearch.setText(cities.getName());
                        viewModel.getCreateAdRequest().setCityName(cities.getName());
                        viewModel.getCreateAdRequest().setLat(cities.getLat());
                        viewModel.getCreateAdRequest().setLng(cities.getLng());
                        mapHelper.addMarker(new LatLng(Double.parseDouble(cities.getLat()), Double.parseDouble(cities.getLng())), false);
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
        viewModel.cities();
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
