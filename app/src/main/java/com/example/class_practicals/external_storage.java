package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class external_storage extends AppCompatActivity {

    EditText ed1,ed2;
    Button b2;
    String filename="abc.txt";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage);
        ed1=findViewById(R.id.editTextTextPersonName4);
        ed2=findViewById(R.id.editTextTextPassword);
        b2=findViewById(R.id.button4);

        String permission[]={Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE};

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((ContextCompat.checkSelfPermission(getApplicationContext(),permission[0])!= PackageManager.PERMISSION_GRANTED)
                        ||
                        (ContextCompat.checkSelfPermission(getApplicationContext(),permission[0])!=PackageManager.PERMISSION_GRANTED))
                {

                    ActivityCompat.requestPermissions(external_storage.this,permission,34);
                }

                String name=ed1.getText().toString();
                String pass=ed2.getText().toString();
                
                String state= Environment.getExternalStorageState();
                if(state.equals(Environment.MEDIA_MOUNTED_READ_ONLY))
                {
                    Toast.makeText(getApplicationContext(),"only redable",Toast.LENGTH_SHORT).show();
                    
                }
                else if(state.equals(Environment.MEDIA_MOUNTED))
                {
                    Toast.makeText(getApplicationContext(),"read and write are possible",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"no external storage",Toast.LENGTH_SHORT).show();

                }

                    try {
                        File f = new File(getExternalFilesDir("dir"),filename);
                        f.createNewFile();
                        FileOutputStream fout = new FileOutputStream(f);
                        fout.write(name.getBytes());
                        fout.write(pass.getBytes());
                        Log.i("key",f.getAbsolutePath());
                        Toast.makeText(getApplicationContext(), f.getAbsolutePath(),Toast.LENGTH_LONG).show();

                    }
                    catch (Exception e)
                    {

                    }
                Intent intent=new Intent(getApplicationContext(),external2.class);
                startActivity(intent);
                    setContentView(R.layout.activity_external2);
                
            }
        });
    }
}