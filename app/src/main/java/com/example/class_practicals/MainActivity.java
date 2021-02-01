 package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button1,b2;
    ProgressBar progressBar;
    int progressStatus=0;
    TextView tvv1;
    Handler h=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        button1=findViewById(R.id.button1);
        b2=findViewById(R.id.threadbtn);
       tvv1=findViewById(R.id.tvv1);
        progressBar=findViewById(R.id.progress_horizontal);
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 1;
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            tvv1.setText(progressStatus+"/"+progressBar.getMax());

                        }
                    });
                    progressBar.setProgress(progressStatus);


                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                    }
                }
            }

        });t.start();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=ratingBar.getRating();
                Toast.makeText(getApplicationContext(),"rating is"+a,Toast.LENGTH_SHORT).show();

                int b=ratingBar.getNumStars();
                Toast.makeText(getApplicationContext(),"number of stars are"+b,Toast.LENGTH_SHORT).show();

            }
        });

    }
}