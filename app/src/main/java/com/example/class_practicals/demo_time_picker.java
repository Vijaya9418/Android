package com.example.class_practicals;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class demo_time_picker extends AppCompatActivity {
    TimePicker tp;
    Button dpd;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_time_picker);
        tp=findViewById(R.id.time);
        dpd=findViewById(R.id.dpd3);
        dpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour=tp.getHour();
                int min=tp.getMinute();

                Toast.makeText(getApplicationContext()," "+hour+" "+min,Toast.LENGTH_LONG).show();
            }
        });


    }
}