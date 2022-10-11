package com.example.activitybuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Activity2 extends AppCompatActivity {

    RelativeLayout rl_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        rl_two = findViewById(R.id.rl_two);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            rl_two.setBackgroundColor(extras.getInt("bgColor"));
        }
    }


}