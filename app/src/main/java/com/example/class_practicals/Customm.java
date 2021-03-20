package com.example.class_practicals;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

public class Customm extends ArrayAdapter {
    TextView tv1;
    TextView tv2;
    Button b1;
    Context ct;
    ArrayList<employee> al=new ArrayList();
    int res;

    public Customm(@NonNull Context context, int resource, ListView lv1) {
        super(context, resource);
        ct=context;
        this.al=al;
        this.res=res;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ct);
        View v=inflater.inflate(R.layout.cust,null,false);
        b1=v.findViewById(R.id.buttom);
        tv1=v.findViewById(R.id.tvvv1);
        tv2=v.findViewById(R.id.tvvv2);

        tv1.setText(al.get(position).getFirstname());
        tv2.setText(al.get(position).getLastname());
        b1.setText(al.get(position).getImg());
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
               alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
               alertDialogBuilder.setPositiveButton("yes",
                       new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface arg0, int arg1) {

                               Toast.makeText(getContext(),"yes",Toast.LENGTH_LONG).show();

                           }
                       });

               alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(getContext(),"No",Toast.LENGTH_LONG).show();

                   }
               });
               AlertDialog alertDialog = alertDialogBuilder.create();
               alertDialog.show();

           }
       });
return super.getView(position,convertView,parent);
    }
   
}
