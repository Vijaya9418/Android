package com.example.class_practicals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment2 extends Fragment {


View v;
TextView tv2;
Button b2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_blank2, container, false);
        tv2=v.findViewById(R.id.tvf2);
        b2=v.findViewById(R.id.bf2);
        String abc=this.getArguments().getString("key");
        tv2.setText(abc);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "thiz is f2", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}