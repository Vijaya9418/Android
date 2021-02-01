package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrollVieww extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_vieww);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
    }

    public void enter1(View view)
    {
        Toast.makeText(getApplicationContext(),"this is button1",Toast.LENGTH_SHORT).show();
    }

    public void enter2(View view)
    {
        Toast.makeText(getApplicationContext(),"this is button2",Toast.LENGTH_SHORT).show();
    }
}