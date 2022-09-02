package com.example.solito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GPS_Maps extends AppCompatActivity {
    private GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps_maps);

        SupportMapFragment mapFragment = SupportMapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.map, mapFragment)
                .commit();
      //  mapFragment.getMapAsync(this);
    }
   // @Override
    //public void onMapReady(@NonNull GoogleMap googleMap) {
     //   map = googleMap;
       // LatLng mex = new LatLng(-34,121);
      //  map.addMarker(new MarkerOptions().position(mex).title("Hola"));
       // map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
      //  map.moveCamera(CameraUpdateFactory.newLatLng(mex));
    //}
}