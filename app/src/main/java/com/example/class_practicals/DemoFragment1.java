package com.example.class_practicals;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment1 extends Fragment {
    TextView tv2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_demo_fragment1,container, false);
        tv2=v.findViewById(R.id.tvf2);
        String str=tv2.getText().toString();
        DemoFragment2 holder=DemoFragment1.demo(str);
        return v;
    }

    public static DemoFragment2 demo(String str)
    {
        DemoFragment2 obj=new DemoFragment2();
        Bundle b=new Bundle();
        b.putString("hello",str);
        obj.setArguments(b);
        obj.read();
        return obj;
    }
}