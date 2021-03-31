package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Shared_pref extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button bt1,bt2,bt3;
    SharedPreferences sp;

    public static final String MyPreferences ="MyPrefs";
    public static final String Name ="nameKey";
    public static final String Phone ="phoneKey";
    public static final String Email ="emailKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        ed1=findViewById(R.id.edt1);
        ed2=findViewById(R.id.edt2);
        ed3=findViewById(R.id.edt3);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);



        sp = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = ed1.getText().toString();
                String ph = ed2.getText().toString();
                String e = ed3.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString(Name,n);
                editor.putString(Phone,ph);
                editor.putString(Email,e);
                editor.commit();
                Toast.makeText(getApplicationContext(), "Data saved Successfully !",Toast.LENGTH_LONG).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences.Editor editor = sp.edit();
                ed1.setText(sp.getString(Name,"nameKey"));
                ed2.setText(sp.getString(Phone,"phoneKey"));
                ed3.setText(sp.getString(Email,"emailKey"));
                editor.commit();
                Toast.makeText(getApplicationContext(), "Data retreived Successfully !",Toast.LENGTH_LONG).show();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString(Name,"");
                editor.putString(Phone,"");
                editor.putString(Email,"");
                editor.commit();
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");

                Toast.makeText(getApplicationContext(), "Data Cleared Successfully !",Toast.LENGTH_LONG).show();
            }
        });
    }
}