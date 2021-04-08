package com.example.class_practicals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class navigationn extends AppCompatActivity {
    TabLayout tb1;
    ViewPager vp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationn);
        tb1=findViewById(R.id.tb1);
        vp1=findViewById(R.id.vp1);
        tb1.setBackgroundColor(getResources().getColor(R.color.whatsapp));

        tb1.addTab(tb1.newTab().setText("CHATS"));
        tb1.addTab(tb1.newTab().setText("STATUS"));
        tb1.addTab(tb1.newTab().setText("CALLS"));
        Demo adapt=new Demo(this,getSupportFragmentManager(),tb1.getTabCount());
        vp1.setAdapter(adapt);

        vp1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb1));

        tb1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}