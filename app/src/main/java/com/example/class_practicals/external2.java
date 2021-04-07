package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.BreakIterator;

import javax.xml.transform.Result;

public class external2 extends AppCompatActivity {
    FileInputStream fstream;
    private  String filename="abc.txt";
    private String fileboth="dir";
    File myExternalFile;
    TextView textView2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external2);
        textView2=findViewById(R.id.textView2);
        b1=findViewById(R.id.button5);
        try {
            myExternalFile=new File(getExternalFilesDir(fileboth),filename);
            fstream=new FileInputStream(myExternalFile);
            StringBuffer stringBuffer=new StringBuffer();
            int i;
            while ((i=fstream.read())!=-1)
            {
                stringBuffer.append((char)i);
            }
            fstream.close();
            String details[]=stringBuffer.toString().split("\n");
            textView2.setText("Name: "+details[0]);

//            textView2.setText("Name: "+details[0]+"\nPassword:" +details[1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),external_storage.class);
                startActivity(intent);
            }
        });


    }
}