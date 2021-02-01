package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.HttpCookie;

public class pending_intent extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_intent);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                PendingIntent p=PendingIntent.getActivity(getApplicationContext(),1,i,PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder nb=new Notification.Builder(getApplicationContext());
                nb.setContentTitle("My notification");
                nb.setContentText("hello pending intent");
                nb.setSmallIcon(R.mipmap.ic_launcher);
                NotificationManager nm= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                nm.notify(1,nb.build());

                try {
                    p.send();
                } catch (PendingIntent.CanceledException e) {
                    e.printStackTrace();
                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationManager nms= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                nms.cancel(1);

            }
        });
    }
}