package com.example.covid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class pharmacy extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    ArrayList<LatLng> arrayList=new ArrayList<LatLng>();
    LatLng karnatak = new LatLng(15.546684, 75.131552);
    LatLng mahaveer = new LatLng(15.241380, 76.867178);
    LatLng karnataka = new LatLng(13.581508, 74.790762);
    LatLng karnataka2 = new LatLng(12.800674, 76.636465);
    LatLng karnataka3 = new LatLng(13.357141, 77.625235);
    LatLng bhavani = new LatLng(13.176816, 77.864592);
    LatLng mathaji = new LatLng(13.413303, 77.704472);
    LatLng savanur = new LatLng(16.195854, 75.177616);
    LatLng maruthi = new LatLng(14.074947, 77.001347);
    LatLng karnataka4 = new LatLng(12.642654, 76.517948);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(karnatak);
        arrayList.add(mahaveer);
        arrayList.add(karnataka);
        arrayList.add(karnataka2);
        arrayList.add(karnataka3);
        arrayList.add(bhavani);
        arrayList.add(mathaji);
        arrayList.add(savanur);
        arrayList.add(maruthi);
        arrayList.add(karnataka4);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        int height = 100;
        int width = 100;
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.pharmacy);
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, width, height, false);
        BitmapDescriptor smallMarkerIcon = BitmapDescriptorFactory.fromBitmap(smallMarker);
        for (int i=0;i<arrayList.size();i++){
            mMap.addMarker(new MarkerOptions().position(arrayList.get(0)).title("Karnatak medical stores\nPH : 08362221224").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(1)).title("Mahaveer medical stores\nPH : 09980271344").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(2)).title("Karnataka medical stores\nPH : 08202524048").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(3)).title("Karnataka medical store\nPH : 09972281226").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(4)).title("New karnataka medical & general store\nPH : 08147583474").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(5)).title("Bhavani medical store\nPH : 08028444198").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(6)).title("Mathaji medical stores\nPH : 08553891177").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(7)).title("Savanur medical stores\nPH : 08362221278").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(8)).title("Maruthi medical stores\nPH : 08022386029").icon(smallMarkerIcon));
            mMap.addMarker(new MarkerOptions().position(arrayList.get(9)).title("Karnataka medical store\nPH : 09972281226").icon(smallMarkerIcon));

            //new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.pharmacy));

            mMap.animateCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(arrayList.get(i),7));
        }
    }
}
