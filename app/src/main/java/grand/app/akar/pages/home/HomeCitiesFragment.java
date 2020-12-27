package grand.app.akar.pages.home;

import android.Manifest;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
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
import com.google.android.gms.maps.model.Marker;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.maps.MapHelper;
import grand.app.akar.databinding.FragmentHomeBinding;
import grand.app.akar.databinding.FragmentHomeCitiesBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import grand.app.akar.pages.auth.models.cities.CitiesResponse;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import grand.app.akar.pages.myAccount.MyAccountFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;


public class HomeCitiesFragment extends BaseFragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private Context context;
    @Inject
    AdsViewModel viewModel;
    private FragmentHomeCitiesBinding binding;
    MapHelper mapHelper;
    GoogleMap mMap;
    Bundle savedInstanceState;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_cities, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        this.savedInstanceState = savedInstanceState;
        setEvent();
        init(savedInstanceState);
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.CURRENT_LOCATION:
                    mapHelper.getLastKnownLocation();
                    break;
                case Constants.CITIES:
                    viewModel.setCitiesList(((CitiesResponse) mutable.object).getCitiesList());
                    for (int i = 0; i < viewModel.getCitiesList().size(); i++) {
                        mapHelper.addCitiesMarker(viewModel.getCitiesList().get(i));
                    }
                    break;
            }
        });
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        mapHelper = new MapHelper(mMap, context);
        mapHelper.getLastKnownLocation();
        viewModel.cities();
    }

    @Override
    public void onResume() {
        binding.mapView.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
        super.onResume();
    }


    @Override
    public void onPause() {
        super.onPause();
        binding.mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding.mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        binding.mapView.onLowMemory();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        binding.mapView.getMapAsync(this);
        binding.mapView.onResume();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void init(Bundle savedInstanceState) {
        binding.mapView.onCreate(savedInstanceState);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((AppCompatActivity) context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
        } else {
            binding.mapView.getMapAsync(this);
        }
    }


    @Override
    public boolean onMarkerClick(Marker marker) {
        int position = mapHelper.markerPosition(marker);
        if (position != -1) {
            MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getCitiesList().get(position).getId()), null, HomeFragment.class.getName(), null);
        }
        return false;
    }
}
