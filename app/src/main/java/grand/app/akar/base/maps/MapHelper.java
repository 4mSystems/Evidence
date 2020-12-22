package grand.app.akar.base.maps;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.LocationManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;

import grand.app.akar.base.MyApplication;

public class MapHelper {
    public double driverLat, driverLng;
    public MarkerOptions markerOptionsDriver;
    public Marker startMarker = null;
    public GoogleMap mMap;
    Context context;

    public MapHelper(GoogleMap mMap, Context context) {
        this.mMap = mMap;
        this.context = context;
    }

    private final String TAG = "MapHelper";

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
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(position, 13));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(position).zoom(17).bearing(90).tilt(40).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        driverLat = position.latitude;
        driverLng = position.longitude;
        addMarker(position, false);
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
}
