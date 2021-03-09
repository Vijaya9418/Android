package com.example.class_practicals;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.media.MediaPlayer;
import android.widget.Toast;

public class DemoJobToDo extends JobService {
    MediaPlayer mp;
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        mp=MediaPlayer.create(this,R.raw.alarm);
        mp.start();

        Toast.makeText(this,"alarm is ringing",Toast.LENGTH_LONG).show();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        mp=MediaPlayer.create(this,R.raw.alarm);
        mp.stop();

        Toast.makeText(this,"alarm is stop",Toast.LENGTH_LONG).show();
        return true;
    }
}
