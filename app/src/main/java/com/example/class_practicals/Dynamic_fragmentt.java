package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dynamic_fragmentt extends AppCompatActivity {
    Button dm1,dm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragmentt);
        dm1=findViewById(R.id.dm1);
        dm2=findViewById(R.id.dm2);

        dm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load(new BlankFragment1());
            }
        });

        dm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load(new BlankFragment2());
            }
        });
    }

    public void load(Fragment obj)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
      ft.replace(R.id.df1,obj);
      ft.commit();
    }
}