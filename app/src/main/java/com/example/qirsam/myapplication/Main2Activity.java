package com.example.qirsam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calculation(View v){
        double D,s, K, l, result;
        D = 0; s = 0; result = 0; l = 0;
        EditText DText = (EditText) findViewById(R.id.K);
        EditText SText = (EditText) findViewById(R.id.K);
        EditText LText = (EditText) findViewById(R.id.K);
        TextView KText = (TextView) findViewById(R.id.K);
        TextView ResultText = (TextView) findViewById(R.id.resobshmas);
        D = Double.parseDouble(DText.getText().toString()) * 0.001;
        s = Double.parseDouble(SText.getText().toString()) * 0.001;
        K = Double.parseDouble(KText.getText().toString());
        l = Double.parseDouble(LText.getText().toString());
        result = 3.14 * D * s * K * l;
        DecimalFormat f = new DecimalFormat("##.000");
        if (result != 0)
        ResultText.setText(String.valueOf(f.format(result)));
        else  ResultText.setText(String.valueOf(result));
    }
}
