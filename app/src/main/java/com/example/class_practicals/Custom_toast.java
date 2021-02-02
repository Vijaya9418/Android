package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Custom_toast extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

    }
    public  void submit(View v)
    {
        LayoutInflater inflater=getLayoutInflater();
        View l=inflater.inflate(R.layout.activity_custom_toast_layout ,findViewById(R.id.li));
        TextView tv1=l.findViewById(R.id.tv1);
        tv1.setText("i am custom toast");

        Toast t=new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(l);
        t.show();
    }
}