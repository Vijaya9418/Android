package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class hw extends AppCompatActivity {
    TextView textView, time;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    Button alarmSet;
    Calendar calendar;
    int month,day,year,hour,min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw);

        textView = findViewById(R.id.dateFromDatePicker);
        time = findViewById(R.id.timeFromDatePicker);
        alarmSet = findViewById(R.id.setAlarm);


        alarmSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                cal.set(year,month,day,hour,min);
                setAlarm(cal);
            }
        });

    }

    public void chooseDate(View view) {
        calendar = Calendar.getInstance();

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        year = calendar.get(Calendar.YEAR);

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textView.setText(dayOfMonth+" / "+(month+1)+" / "+year);
            }
        },year,month,day);

        datePickerDialog.show();
    }

    public void chooseTime(View view) {
        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);
        min = calendar.get(Calendar.MINUTE);

        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                time.setText(hourOfDay+" : "+minute);
            }
        },hour,min,false);

        timePickerDialog.show();
    }

    public void setAlarm(Calendar calendar){

        Intent intent = new Intent(this,MyBroadCast.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this,1,intent,0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);
        Toast.makeText(this,"Alarm is set", Toast.LENGTH_SHORT).show();
    }
}
