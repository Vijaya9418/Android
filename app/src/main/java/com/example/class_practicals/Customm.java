package com.example.class_practicals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Customm extends ArrayAdapter {
    TextView tv1;
    TextView tv2;
    Button b1;
    Context ct;
    ArrayList al;
    int res;

    public Customm(@NonNull Context context, int resource) {
        super(context, resource);
        ct=context;
        this.al=al;
        this.res=res;
    }

//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater=LayoutInflater.from(ct);
//        View v=inflater.inflate(R.layout.cust,null,false);
//        b1=v.findViewById(R.id.buttom);
//        tv1=v.findViewById(R.id.tvvv1);
//        tv2=v.findViewById(R.id.tvvv2);
//    }
   
}
