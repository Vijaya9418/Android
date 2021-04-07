package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class navigationn extends AppCompatActivity {
    TabLayout tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationn);
        tb1=findViewById(R.id.tb1);
        tb1.addTab(tb1.newTab().setText("tab1"));
        tb1.addTab(tb1.newTab().setText("tab2"));
        tb1.addTab(tb1.newTab().setText("tab3"));
    }
}