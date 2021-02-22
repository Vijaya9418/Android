package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;

public class DemoJobSchedular extends AppCompatActivity {
    JobScheduler j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_job_schedular);
    }

    public void startMusic(View v)
    {
         j= (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        ComponentName cm=new ComponentName(this,DemoJobToDo.class);
        JobInfo.Builder b= new JobInfo.Builder(1,cm);
        b.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        b.setRequiresCharging(false);
        b.setRequiresDeviceIdle(false);
        JobInfo ji=b.build();
        j.schedule(ji);
    }


    public void stopMusic(View v)
    {
      if(j!=null)
      {
          j.cancel(1);
      }
    }
}