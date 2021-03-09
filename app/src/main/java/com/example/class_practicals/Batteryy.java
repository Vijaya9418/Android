package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Batteryy extends AppCompatActivity {
    TextView tvb;
    demobattery db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batteryy);
       tvb=findViewById(R.id.tvb);
       db=new demobattery(tvb);
       registerReceiver(db,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(db);
    }
}