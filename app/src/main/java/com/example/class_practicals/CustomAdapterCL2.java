package com.example.class_practicals;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapterCL2 extends ArrayAdapter {
    ImageView iv;
    TextView ttv1,ttv2;
    Button b;
    Context ct;
    ArrayList<Employee> al;
    int res;
    public CustomAdapterCL2(@NonNull Context context, int resource, ArrayList al) {
        super(context, resource,al);
        ct= context;
        this.al = al;
        this.res=res;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent)
    {
        LayoutInflater li= LayoutInflater.from(ct);
        View v = li.inflate(R.layout.activity_custom_adapter_c_l2,null,false);
        b=v.findViewById(R.id.b2);
        ttv1=v.findViewById(R.id.tv1);
        ttv2=v.findViewById(R.id.tv2);
        iv=v.findViewById(R.id.iv1);
        ttv1.setText(al.get(position).getFirstName());
        ttv2.setText(al.get(position).getLastName());
        iv.setImageResource(al.get(position).getImg());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b = new AlertDialog.Builder(ct);
                b.setTitle("Are you sure?");
                b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        al.remove(position);
                    }
                });
                b.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog ab=b.create();
                ab.show();
            }
        });

        return v;

    }
}
