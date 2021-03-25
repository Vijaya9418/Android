package com.example.class_practicals;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;

public class cross extends AppCompatEditText {
    Drawable dark,light;
    public cross(@NonNull Context context, AttributeSet attrs) {
        super(context);
        init();

    }
    void init()
    {
        dark= ResourcesCompat.getDrawable(getResources(),R.drawable.ic_baseline_close_24,null);
        light= ResourcesCompat.getDrawable(getResources(),R.drawable.ic_baseline_clear_24,null);

        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                show();
                clear();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    void show()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,dark,null);

    }
    void clear()
    {

        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean flag=false;
                float size=getWidth()-getPaddingEnd()-dark.getIntrinsicWidth();
                if(motionEvent.getX()>size)
                {
                    flag=true;
                }
                if(flag)
                {
                    switch (motionEvent.getAction())
                    {
                        case MotionEvent.ACTION_DOWN: getText().clear();break;
                        case MotionEvent.ACTION_UP: setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,light,null);
                        break;

                    }
                }
                return false;
            }
        });
    }
}
