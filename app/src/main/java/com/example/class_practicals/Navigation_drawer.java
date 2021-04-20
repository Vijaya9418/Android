package com.example.class_practicals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Navigation_drawer extends AppCompatActivity {
    DrawerLayout dl1;
    ActionBarDrawerToggle ab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        dl1 = findViewById(R.id.dl1);




        ab = new ActionBarDrawerToggle(this, dl1, R.string.open, R.string.close);
        ab.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dl1.addDrawerListener(ab);
        logic();


    }







    void logic() {

        NavigationView nv = findViewById(R.id.nv1);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment f = null;
                int id = item.getItemId();
                if (id == R.id.nf1) {
                    f = new navfragment1();
                }
                if (id == R.id.nf2) {
                    f = new navfragment2();
                }
                if (id == R.id.nf3) {
                    f = new navfragment3();
                }
                if (f != null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.fm1, f);
                    return true;
                }
                return true;
            }
        });

    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (ab.onOptionsItemSelected(item)) {
//           return true;
//           return super.onOptionsMenuClosed(item);
//       }




}