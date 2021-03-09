package com.example.class_practicals;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class demobattery extends BroadcastReceiver {
    TextView tvb;
    demobattery(TextView v)
    {
        tvb=v;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int p=intent.getIntExtra("level",0);
        Toast.makeText(context,"hello" + p +"%",Toast.LENGTH_LONG).show();
     if(p<20)
   {

       Notification.Builder nb=new Notification.Builder(context);
       nb.setContentTitle("My notification");
       nb.setContentText("hello pending intent");
       nb.setSmallIcon(R.mipmap.ic_launcher);
       NotificationManager nm= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
       nm.notify(1,nb.build());

   }
    }
}
