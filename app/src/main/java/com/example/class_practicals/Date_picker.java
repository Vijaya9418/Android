package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class Date_picker extends AppCompatActivity {
   DatePicker dp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        dp1=findViewById(R.id.dp);
    }
    public void date(View v)
    {
        int day=dp1.getDayOfMonth();
        int month=dp1.getMonth();
        int year=dp1.getYear();
        int dayofweek=dp1.getFirstDayOfWeek();

        Toast.makeText(getApplicationContext(),"  "+day+"  "+(month+1)+"  "+year+"  "+dayofweek,Toast.LENGTH_LONG).show();
    }
}