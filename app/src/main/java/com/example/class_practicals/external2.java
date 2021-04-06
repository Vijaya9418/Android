package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class external2 extends AppCompatActivity {




    TextView textView1, textView2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external2);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        b1=findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),external_storage.class);
                startActivity(intent);
            }
        });


    }
}