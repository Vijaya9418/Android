package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class validation extends AppCompatActivity {
    EditText edd1,edd2;
    TextView name,password;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validation_act);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password1);
        edd1=findViewById(R.id.edd1);
        edd2=findViewById(R.id.edd2);
        add=findViewById(R.id.add1);
    }
    public void add(View v)
    {
        String nam=edd1.getText().toString();
        String passwod=edd2.getText().toString();
        if(nam.length()==0)
        {
            edd1.requestFocus();
            edd1.setError("Fields cannot be empty");
        }
        else if(!nam.matches("[a-zA-Z]"))
        {
            edd1.requestFocus();
            edd1.setError("only alphabets are allowed");
        }
        else if(passwod.length()==0)
        {
            edd2.requestFocus();
            edd2.setError("password cannot be empty");
        }

        else if(passwod.length()>10)
        {
            edd2.requestFocus();
            edd2.setError("maximum 10 digits are allowed ");

        }
        else
        {
            Toast.makeText(getApplicationContext(),"submitted successfully",Toast.LENGTH_SHORT).show();
        }

    }
}