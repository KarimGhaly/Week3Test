package com.example.admin.week3test;

import android.app.Fragment;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements InsertCarFragment.OnFragmentInteractionListener, ListingCarsFragment.OnFragmentInteractionListener {

    private InsertCarFragment insertCarFragment;
    private ListingCarsFragment listingCarsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertCarFragment = InsertCarFragment.newInstance("","");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.InsertFrameLayout, insertCarFragment,"InsertTAG");

        fragmentTransaction.commit();

        listingCarsFragment = ListingCarsFragment.newInstance("","");
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.ListingFrameLayout, listingCarsFragment,"ListTAG");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void SendCarToMainActivity(Cars C) {
        listingCarsFragment.AddCarToList(C);
    }
}
