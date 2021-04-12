package com.example.class_practicals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    String[] a = {"IAN", "RITIK", "SALMAN", "SHAHRUKH"};
    String[] b = {"A","B","C","D"};
    int[] image = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};
    int[] uId = {1234,1236,1237,1239};
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_2, container, false);
        listView=v.findViewById(R.id.lv2);

        CustomAdapter obj = new CustomAdapter();

        listView.setAdapter(obj);
        return v;
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