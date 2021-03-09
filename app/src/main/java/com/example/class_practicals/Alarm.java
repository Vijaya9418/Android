package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Alarm extends AppCompatActivity {
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        ed1=findViewById(R.id.ed1);

        b1=findViewById(R.id.alarmbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=Integer.parseInt(ed1.getText().toString());
                Intent intent=new Intent(getApplicationContext(),MyBroadCast.class);
                PendingIntent pi=PendingIntent.getBroadcast(getApplicationContext(),1,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                AlarmManager am= (AlarmManager) getSystemService(ALARM_SERVICE);
                am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pi);
                Toast.makeText(getApplicationContext(),"alarm will ring in"+i+"seconds",Toast.LENGTH_SHORT).show();


            }
        });
    }
}