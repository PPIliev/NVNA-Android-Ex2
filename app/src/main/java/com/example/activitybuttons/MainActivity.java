package com.example.activitybuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg_group;
    RadioButton rb_red, rb_green, rb_pink, rb_black;
    Button b_submit;
    int color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_group = findViewById(R.id.rg_group);
        b_submit = findViewById(R.id.b_submit);



        b_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rg_group.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Please, select a color", Toast.LENGTH_SHORT).show();
                } else {
                    findButton(selectedId);
                    openOtherActivity();
            }
            }
        });




    }

    public void openOtherActivity() {
        Intent i = new Intent(getApplicationContext(), Activity2.class);
        i.putExtra("bgColor", color);
        startActivity(i);

    }

    public void findButton(int selectedId) {
        switch (selectedId) {
            case R.id.rb_red:
                color = ContextCompat.getColor(getApplicationContext(), R.color.Red);
                break;
            case R.id.rb_black:
                color = ContextCompat.getColor(getApplicationContext(), R.color.black);
                break;
            case R.id.rb_pink:
                color = ContextCompat.getColor(getApplicationContext(), R.color.Pink);
                break;
            case R.id.rb_green:
                color = ContextCompat.getColor(getApplicationContext(), R.color.Green);
                break;
        }

    }


}