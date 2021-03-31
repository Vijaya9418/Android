package com.example.class_practicals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class hw3 extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2,b3;
    CheckBox ch1;
    ImageView imm;
    private static final int PICK_IMAGE = 100;
    Uri imageUri;

    SharedPreferences sp;

    public static final String MyPreferences ="MyPrefs";
    public static final String Name ="nameKey";
    public static final String ID ="IDKey";
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3);
        ed1=findViewById(R.id.edu);
        ed2=findViewById(R.id.edu2);
        b1=findViewById(R.id.bu);
        b2=findViewById(R.id.bu2);
        b3=findViewById(R.id.bu3);
        ch1=findViewById(R.id.ch1);
        imm=findViewById(R.id.imm);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGallery();

            }
        });
        sp = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = ed1.getText().toString();
                String id = ed2.getText().toString();



                SharedPreferences.Editor editor = sp.edit();
                editor.putString(Name,n);
                editor.putString(ID,id);

                editor.commit();
                Toast.makeText(getApplicationContext(), "Data saved Successfully !",Toast.LENGTH_LONG).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences.Editor editor = sp.edit();
                ed1.setText(sp.getString(Name,"nameKey"));
                ed2.setText(sp.getString(ID,"IDKey"));

                editor.commit();
                Toast.makeText(getApplicationContext(), "Data retreived Successfully !",Toast.LENGTH_LONG).show();
            }
        });

    }
    public void openGallery()
    {
        Intent gal=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gal,PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK && requestCode==PICK_IMAGE)
        {
            imageUri=data.getData();
            imm.setImageURI(imageUri);
        }
    }
}