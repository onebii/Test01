package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button plus, minus, multiplication, dev;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("2220 황원비");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        dev = findViewById(R.id.dev);
        tv = findViewById(R.id.tv);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                tv.setText(result);
            }
        });






















//        n1 = findViewById(R.id.n1);
//        n2 = findViewById(R.id.n2);
//        tv = findViewById(R.id.tv);
//
//        plus = (Button) findViewById(R.id.plus);
//        minus = (Button) findViewById(R.id.minus);
//        multiplication = (Button) findViewById(R.id.multiplication);
//        dev = (Button) findViewById(R.id.dev);
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int result = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
//                tv.setText("계산 결과 : " + result);
//            }
//        });
//
//        minus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int result = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
//                tv.setText("계산 결과 : " + result);            }
//        });
//
//        multiplication.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int result = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
//                tv.setText("계산 결과 : " + result);
//            }
//        });
//
//        dev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int result = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
//                tv.setText("계산 결과 : " + result);
//            }
//        });
    }
}
