package com.example.class_practicals;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class hw_f1 extends Fragment {

    TextView tvvv;
    EditText ed1;
    Button b1,b2,b3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.fragment_hw_f1, container, false);

        tvvv=view.findViewById(R.id.tvvv);
        ed1=view.findViewById(R.id.ed1);
        b1=view.findViewById(R.id.b1);
        b2=view.findViewById(R.id.b2);
        b3=view.findViewById(R.id.b3);

        return view;


    }

    public void click(View v)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

}