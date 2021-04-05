package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class internal_storage extends AppCompatActivity {

    TextView n,ph,em;
    Button s,r,c;
    String data;
    private final String file="myFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage);

        n=findViewById(R.id.editTextTextPersonName);
        ph=findViewById(R.id.editTextTextPersonName2);
        em=findViewById(R.id.editTextTextPersonName3);
        s=findViewById(R.id.button);
        r=findViewById(R.id.button2);
        c=findViewById(R.id.button3);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=n.getText().toString();
                try {
                    FileOutputStream fOut = openFileOutput(file,MODE_PRIVATE);
                    fOut.write(data.getBytes());
                    fOut.close();

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(), "Data Saved Successfully",Toast.LENGTH_LONG).show();
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            String s="";
            @Override
            public void onClick(View v) {
                data=n.getText().toString();
                try {
                    FileInputStream fIn = openFileInput(file);
                    int rd = 0;
                    while((rd=fIn.read())!=-1){
                        char c =(char)rd;
                        s=s+c;
                    }
                    n.setText(s);
                    fIn.close();
                }
                catch(Exception ae)
                {
                    ae.printStackTrace();
                }
                Toast.makeText(getApplicationContext(), "Data Retrieved Successfully",Toast.LENGTH_LONG).show();

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            String s=null;
            @Override
            public void onClick(View v) {

                n.setText("");
                ph.setText("");
                em.setText("");
            }
        });

    }
}
