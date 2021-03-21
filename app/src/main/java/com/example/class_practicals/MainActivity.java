package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    ListView l;
    ArrayList al;
    CustomAdapterCL2 obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.lv1);
        b1=findViewById(R.id.but1);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        al= new ArrayList();
        obj=new CustomAdapterCL2(this,R.layout.activity_custom_adapter_c_l2,al);
    }
    public void dothis(View v){
        String firstName=e1.getText().toString();
        e1.setText("");

        String lastName = e2.getText().toString();
        e2.setText("");

        al.add(new Employee(R.drawable.ic_launcher_foreground,firstName,lastName));
        l.setAdapter(obj);
        obj.notifyDataSetChanged();
    }
}