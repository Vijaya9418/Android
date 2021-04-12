package com.example.class_practicals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Fragment1 extends Fragment {

    ListView lv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_1, container, false);
        lv1=v.findViewById(R.id.lv1);

        ArrayList<String> al=new ArrayList();
        al.add("1234567890");
        al.add("1234567890");
        al.add("1234567890");
        al.add("1234567890");
        al.add("1234567890");
        al.add("1234567890");
        al.add("1234567890");

        ArrayAdapter ar=new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,al);
        lv1.setAdapter(ar);


        return v;
    }
}