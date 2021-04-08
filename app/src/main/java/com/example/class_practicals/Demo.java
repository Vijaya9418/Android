package com.example.class_practicals;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Demo extends FragmentPagerAdapter {
    Context c;
    int count;
    Demo(Context c, FragmentManager fm,int count)
    {
        super(fm);
        this.c=c;
        this.count=count;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: Fragment1 obj=new Fragment1() ;
            return obj;

            case 1: Fragment2 obj1=new Fragment2() ;
                return obj1;

            case 2: Fragment3 obj2=new Fragment3() ;
                return obj2;
        }
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }
}
