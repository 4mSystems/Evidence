package grand.app.akar.pages.home;

import android.Manifest;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.maps.MapHelper;
import grand.app.akar.databinding.FragmentHomeBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;


public class


HomeFragment extends BaseFragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private Context context;
    @Inject
    HomeViewModel viewModel;
    private FragmentHomeBinding binding;
    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = true;
    MapHelper mapHelper;
    GoogleMap mMap;
    Bundle savedInstanceState;
    BottomSheetBehavior listingSheetBehavior;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        listingSheetBehavior = BottomSheetBehavior.from(binding.listingTypeSheet.listingTypeSheet);
        listingSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        this.savedInstanceState = savedInstanceState;
        viewModel.getCategoriesAdapter().update(UserHelper.getInstance(context).getSettingsData().getCategoriesDataList());
        setEvent();
        init(savedInstanceState);
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            Log.e("setEvent", "setEvent: " + mutable.message);
            switch (mutable.message) {
                case Constants.RESULT_SEARCH_LISTING_TYPE:
                    listingSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                    break;
                case Constants.FLIP_CARD:
                    flipCard();
                    break;
                case Constants.MAP_STYLE:
                    mapHelper.changeMapStyle();
                    break;
                case Constants.CURRENT_LOCATION:
                    mapHelper.getLastKnownLocation();
                    break;
                case Constants.SEARCH_LISTING_TYPE:
                    listingSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    break;
                case Constants.HOME:
                    Log.e("setEvent", "setEvent: ");
                    mMap.clear();
                    viewModel.getHomeAdapter().getHomeDataListFiltered().clear();
                    viewModel.getHomeAdapter().update(((HomeResponse) mutable.object).getHomeDataList());
                    for (int i = 0; i < viewModel.getHomeAdapter().getItemCount(); i++) {
                        mapHelper.addUserMarker(viewModel.getHomeAdapter().getHomeDataListFiltered().get(i));
                    }
                    break;

            }
        });
        loadAnimations();
        changeCameraDistance();
    }

    private void changeCameraDistance() {
        int distance = 8000;
        float scale = getResources().getDisplayMetrics().density * distance;
        binding.cardMap.setCameraDistance(scale);
        binding.cardList.setCameraDistance(scale);
    }

    private void loadAnimations() {
        mSetRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.out_animation);
        mSetLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.in_animation);
    }

    public void flipCard() {
        if (mIsBackVisible) {
            mSetRightOut.setTarget(binding.cardMap);
            mSetLeftIn.setTarget(binding.cardList);
            mSetRightOut.start();
            mSetLeftIn.start();
            binding.mapButtons.setVisibility(View.GONE);
            binding.selectedRc.setVisibility(View.GONE);
            binding.listButtons.setVisibility(View.VISIBLE);
            binding.cardMap.setVisibility(View.GONE);
            binding.cardList.setVisibility(View.VISIBLE);
            mIsBackVisible = false;
        } else {
            mSetRightOut.setTarget(binding.cardList);
            mSetLeftIn.setTarget(binding.cardMap);
            mSetRightOut.start();
            mSetLeftIn.start();
            binding.cardMap.setVisibility(View.VISIBLE);
            binding.cardList.setVisibility(View.GONE);
            binding.mapButtons.setVisibility(View.VISIBLE);
            binding.listButtons.setVisibility(View.GONE);
            mIsBackVisible = true;
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
        mMap.setOnMarkerClickListener(this);
        mapHelper = new MapHelper(mMap, context);
        mapHelper.getLastKnownLocation();
        viewModel.getListing();
    }

    @Override
    public void onResume() {
        Log.e("onResume", "onResume: ");
        binding.mapInclude.mapView.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
        super.onResume();
    }


    @Override
    public void onPause() {
        super.onPause();
        binding.mapInclude.mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding.mapInclude.mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        binding.mapInclude.mapView.onLowMemory();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        binding.mapInclude.mapView.getMapAsync(this);
        binding.mapInclude.mapView.onResume();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void init(Bundle savedInstanceState) {
        binding.mapInclude.mapView.onCreate(savedInstanceState);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((AppCompatActivity) context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
        } else {
            binding.mapInclude.mapView.getMapAsync(this);
        }
    }


    @Override
    public boolean onMarkerClick(Marker marker) {
        int position = mapHelper.markerPosition(marker);
        if (position != -1) {
            binding.selectedRc.setVisibility(View.VISIBLE);
            binding.selectedRc.smoothScrollToPosition(position);
        } else
            binding.selectedRc.setVisibility(View.GONE);

        return false;
    }
}
