package com.example.class_practicals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MyBroadCast extends BroadcastReceiver {
    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context,R.raw.alarm);
        mp.start();

        Toast.makeText(context,"alarm is ringing",Toast.LENGTH_LONG).show();
    }
}
