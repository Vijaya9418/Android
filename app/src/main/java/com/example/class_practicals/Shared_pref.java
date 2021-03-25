package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Shared_pref extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button bt1,bt2,bt3;
    SharedPreferences sharedPreference;

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

//        sharedPreference=getSharedPreferences(MyPREFERENCES, Context,MODE_PRIVATE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=ed1.getText().toString();
                String ph=ed2.getText().toString();
                String e=ed3.getText().toString();

                SharedPreferences.Editor editor=sharedPreference.edit();

//                editor.putString(Name,n);
//                editor.putString(Phone,ph);
//                editor.putString(Email,e);

                editor.commit();

                //device File Explorer--> data-->data-->to your package--> sharedpreference->myprefs
            }
        });
    }
}