package com.example.class_practicals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment1 extends Fragment {

    View v;
    Button bf1;
    TextView tv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_blank1, container, false);
        bf1=v.findViewById(R.id.bf1);
        tv1=v.findViewById(R.id.tvf1);
        String str=tv1.getText().toString();
        bf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b=new Bundle();
                b.putString("key",str+" this is fragment1");
                BlankFragment2 obj=new BlankFragment2();
                obj.setArguments(b);
                getFragmentManager().beginTransaction().replace(R.id.f1,obj).commit();

            }
        });
        return v;
    }

}