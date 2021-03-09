package com.example.class_practicals;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment2 extends Fragment {
    TextView tvf1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v=inflater.inflate(R.layout.activity_demo_fragment2,container, false);

      tvf1=v.findViewById(R.id.tvf1);
        return v;
    }

    public void read()
    {
        String str=this.getArguments().toString();
        tvf1.setText(str);
    }


}