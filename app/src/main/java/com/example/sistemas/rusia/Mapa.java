package com.example.sistemas.rusia;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    public Mapa() {
        // Required empty public constructor
    }

    private GoogleMap mMap;
    public Marker marcador;
    public double lat = 0.0;
    public double lon = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Bundle bundle = getIntent().getExtras();
        int lugar = bundle.getInt("lugar");

        switch (lugar) {
            case 1:
                LatLng sydney = new LatLng(0.8055203, -77.5860189);
                mMap.addMarker(new MarkerOptions().position(sydney).title("Santuario las Lajas"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 2:
                LatLng sydney2 = new LatLng(1.0911111, -77.78250000000003);
                mMap.addMarker(new MarkerOptions().position(sydney2).title("Laguna Verde"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 3:
                LatLng sydney3 = new LatLng(0.9517169999999999, -77.88694299999997);
                mMap.addMarker(new MarkerOptions().position(sydney3).title("Volcan Cumbal"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney3, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 4:
                LatLng sydney4 = new LatLng(1.8300282, -78.73274800000002);
                mMap.addMarker(new MarkerOptions().position(sydney4).title("Tumaco"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney4, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 5:
                LatLng sydney5 = new LatLng(1.2218582, -77.35919030000002);
                mMap.addMarker(new MarkerOptions().position(sydney5).title("Volcan Galeras"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney5, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 6:
                LatLng sydney6 = new LatLng(1.0928651, -77.15426839999998);
                mMap.addMarker(new MarkerOptions().position(sydney6).title("Laguna de la Cocha"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney6, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 7:
                LatLng sydney7 = new LatLng(1.130349, -77.550994);
                mMap.addMarker(new MarkerOptions().position(sydney7).title("Guaitarilla"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney7, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 8:
                LatLng sydney8 = new LatLng(1.4454135, -77.17275649999999);
                mMap.addMarker(new MarkerOptions().position(sydney8).title("cañon de Juanambu"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney8, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

        }
    }

    public void agregarmark(double lat, double lon) {
        LatLng coor = new LatLng(lat, lon);
        CameraUpdate miubicacion = CameraUpdateFactory.newLatLngZoom(coor, 16);
        if (marcador != null) marcador.remove();
        {
            marcador = mMap.addMarker(new MarkerOptions().position(coor).title("tu estas aqui"));
            mMap.animateCamera(miubicacion);
        }
    }

    LocationListener locListe = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarubicacion(location);
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    };

    public void actualizarubicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lon = location.getLongitude();
            agregarmark(lat, lon);

        }
    }

    private void ub() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        LocationManager locma = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location loca = locma.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        actualizarubicacion(loca);
        locma.requestLocationUpdates(LocationManager.GPS_PROVIDER,15000,0,locListe);
    }
}
