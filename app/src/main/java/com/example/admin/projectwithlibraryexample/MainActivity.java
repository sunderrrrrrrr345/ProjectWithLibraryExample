package com.example.admin.projectwithlibraryexample;


import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.customlib.NewDesign;

public class MainActivity extends AppCompatActivity implements NewDesign.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        NewDesign newDesign= (NewDesign) fragmentManager.findFragmentById(R.id.fragment);
        newDesign.Hello("Sunder sharma");


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
