package com.example.radio_group;

import static com.example.radio_group.R.id.Blue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    public static void check(int x, ConstraintLayout cl){
        if(x == R.id.Blue){
            cl.setBackgroundResource(R.drawable.blue);
        }
        else if(x == R.id.Green){
            cl.setBackgroundResource(R.drawable.green);
        }
        else if(x == R.id.Purple){
            cl.setBackgroundResource(R.drawable.purple);
        }
        else{
            cl.setBackgroundResource(R.drawable.red);

        }
    }
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    static
    Switch sb;
    Button btn;
    static RadioGroup rg;
    static ConstraintLayout cl;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = findViewById(R.id.SB1);
        btn = findViewById(R.id.button);
        rg = findViewById(R.id.RG1);
        cl = findViewById(R.id.CL);

    }
    public void pressed(View view) {
        int x = rg.getCheckedRadioButtonId();
        if(!sb.isChecked()){
            check(x, cl);
        }
    }

    public void blue_pressed(View view) {
        if(sb.isChecked()){
            cl.setBackgroundResource(R.drawable.blue);
        }
    }
    public void green_pressed(View view) {
        if(sb.isChecked()){
            cl.setBackgroundResource(R.drawable.green);
        }
    }
    public void purple_pressed(View view) {
        if(sb.isChecked()){
            cl.setBackgroundResource(R.drawable.purple);
        }
    }
    public void red_pressed(View view) {
        if(sb.isChecked()){
            cl.setBackgroundResource(R.drawable.red);
        }
    }
}