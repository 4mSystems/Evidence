package grand.app.akar.base.maps;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.widget.ImageViewCompat;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.base.MyApplication;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.utils.resources.ResourceManager;

import static grand.app.akar.utils.helper.MovementHelper.createDrawableFromView;

public class MapHelper {
    public double driverLat, driverLng;
    public MarkerOptions markerOptionsDriver;
    public Marker startMarker = null;
    public GoogleMap mMap;
    Context context;
    public List<Marker> customMarker = new ArrayList<>();

    public MapHelper(GoogleMap mMap, Context context) {
        this.mMap = mMap;
        this.context = context;
    }

    public MapHelper(Context context) {
        this.context = context;
    }

    public void getAddress(double lat, double lng, MapAddressInterface mapAddressInterface) {
        MapAddress mapAddress = new MapAddress((Activity) context, lat, lng);
        mapAddress.getAddressFromUrl(address -> {
            if (mapAddressInterface != null)
                mapAddressInterface.fetchFullAddress(address);
        });

    }


    public void addMarker(LatLng position, boolean draggable) {
        markerOptionsDriver = new MarkerOptions();
        markerOptionsDriver.draggable(draggable);
        markerOptionsDriver.position(position);
        if (startMarker != null) {
            startMarker.remove();
        }
        startMarker = mMap.addMarker(markerOptionsDriver);
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(position).zoom(17).bearing(90).tilt(40).build()));

    }

    public void animateCamera(LatLng position) {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(position, 10));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(position).zoom(10).bearing(90).tilt(40).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        driverLat = position.latitude;
        driverLng = position.longitude;
//        addMarker(position, false);
    }

    public void getLastKnownLocation() {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        FusedLocationProviderClient fusedLocationClient = LocationServices.getFusedLocationProviderClient(MyApplication.getInstance());
        fusedLocationClient.getLastLocation()
                .addOnSuccessListener((Activity) context, location -> {
                    // Got last known location. In some rare situations this can be null.
                    if (location != null) {
                        animateCamera(new LatLng(location.getLatitude(), location.getLongitude()));
                    }
                });

    }

    public void addUserMarker(HomeData homeData) {
        View markerCustom = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.places_custom_marker, null);
        CustomTextViewMedium priceView = markerCustom.findViewById(R.id.price_map);
        ImageView viewCompat = markerCustom.findViewById(R.id.custom_img);
        priceView.setText(homeData.getPrice());
        if (homeData.getPremium() == 0) {
            viewCompat.setImageDrawable(ResourceManager.getDrawable(R.drawable.places_custom_marker_background));
        } else
            viewCompat.setImageDrawable(ResourceManager.getDrawable(R.drawable.places_custom_marker_premium_background));
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.draggable(false);
        markerOptions.position(new LatLng(Double.parseDouble(homeData.getLat()), Double.parseDouble(homeData.getLng())));
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(createDrawableFromView(context, markerCustom)));
        Marker marker = mMap.addMarker(markerOptions);
        marker.setTag(homeData.getId());
        customMarker.add(marker);
    }

    public void addCitiesMarker(Cities cities) {
        View markerCustom = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.cities_custom_marker, null);
        CustomTextViewMedium priceView = markerCustom.findViewById(R.id.price_map);
        priceView.setText(cities.getName());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.draggable(false);
        markerOptions.position(new LatLng(Double.parseDouble(cities.getLat()), Double.parseDouble(cities.getLng())));
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(createDrawableFromView(context, markerCustom)));
        Marker marker = mMap.addMarker(markerOptions);
        marker.setTag(cities.getId());
        customMarker.add(marker);
    }

    public int markerPosition(Marker marker) {
        for (int i = 0; i < customMarker.size(); i++) {
            if (marker.getTag() == customMarker.get(i).getTag()) {
                return i;
            }
        }
        return -1;
    }

    public void enableLocationDialog() {
        LocationRequest locationRequest = getLocationRequest();
        LocationSettingsRequest settingsRequest = new LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest).build();
        SettingsClient client = LocationServices.getSettingsClient(context);
        Task<LocationSettingsResponse> task = client
                .checkLocationSettings(settingsRequest);

        task.addOnFailureListener((AppCompatActivity) context, e -> {
            int statusCode = ((ApiException) e).getStatusCode();
            if (statusCode == LocationSettingsStatusCodes.RESOLUTION_REQUIRED) {
                try {
                    ResolvableApiException resolvable =
                            (ResolvableApiException) e;
                    resolvable.startResolutionForResult
                            ((AppCompatActivity) context,
                                    1019);
                } catch (IntentSender.SendIntentException sendEx) {
                    sendEx.printStackTrace();
                }
            }
        });
    }

    private LocationRequest getLocationRequest() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(10000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        return locationRequest;
    }

    public void changeMapStyle() {
        if (mMap.getMapType() == GoogleMap.MAP_TYPE_SATELLITE) {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        } else {
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
    }


}
