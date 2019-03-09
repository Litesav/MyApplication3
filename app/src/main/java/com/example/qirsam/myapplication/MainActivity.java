package com.example.qirsam.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void newDisplay(View v){
        ConstraintLayout cl1 = (ConstraintLayout) findViewById(R.id.cl1);
        ConstraintLayout cl2 = (ConstraintLayout) findViewById(R.id.cl2);
        ConstraintLayout cl3 = (ConstraintLayout) findViewById(R.id.cl3);
        ConstraintLayout cl4 = (ConstraintLayout) findViewById(R.id.cl4);
        ConstraintLayout cl5 = (ConstraintLayout) findViewById(R.id.cl5);
        ConstraintLayout cl6 = (ConstraintLayout) findViewById(R.id.cl6);
        ConstraintLayout cl7 = (ConstraintLayout) findViewById(R.id.cl7);
        ConstraintLayout cl8 = (ConstraintLayout) findViewById(R.id.cl8);
        ConstraintLayout cl9 = (ConstraintLayout) findViewById(R.id.cl9);
        ConstraintLayout cl10 = (ConstraintLayout) findViewById(R.id.cl10);
        ConstraintLayout cl11 = (ConstraintLayout) findViewById(R.id.cl11);
        ConstraintLayout mas[] = new ConstraintLayout[]{cl1,cl2,cl3,cl4,cl5,cl6,cl7,cl8,cl9,cl10,cl11};
        for(int i = 0; i < mas.length; i++){
            mas[i].setVisibility(View.GONE);
        }
    }


    public void openActivity1(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


}
