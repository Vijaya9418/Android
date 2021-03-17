package com.example.class_practicals;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom_adapter extends AppCompatActivity {

    String[] a = {"IAN", "RITIK", "SALMAN", "SHAHRUKH"};
    String[] b = {"A","B","C","D"};
    int[] image = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};
    int[] uId = {1234,1236,1237,1239};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        listView = findViewById(R.id.listView);

        CustomAdapter obj = new CustomAdapter();

        listView.setAdapter(obj);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return a.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.row, null);

            TextView t1 = convertView.findViewById(R.id.name);
            TextView t2 = convertView.findViewById(R.id.pnumber);
            TextView t3 = convertView.findViewById(R.id.desc);
            ImageView imageView = convertView.findViewById(R.id.userImage);

            t1.setText(a[position]);
            t2.setText(b[position]);
            t3.setText("UID: "+ uId[position]);
            imageView.setImageResource(image[position]);

            return convertView;
        }
    }
}