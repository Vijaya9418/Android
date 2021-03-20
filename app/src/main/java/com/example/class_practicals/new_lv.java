package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class new_lv extends AppCompatActivity {
    ListView lv1;
    ArrayList al;
    EditText ed1;
    EditText ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lv);
        lv1=findViewById(R.id.lv1);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        b1=findViewById(R.id.b1);
       Customm obj=new Customm(this,R.layout.activity_new_lv,lv1);
    }
//    public void dothis(View v)
//    {
//        String fn=firstname.getText().toString();
//        firstname.setText("");
//
//        String ln=lastname.getText().toString();
//        lastname.setText("");
//    }
}