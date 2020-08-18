package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ScondActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    String number1;
    String number2;
    int n1;
    int n2;
    TextView lblsum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        lblsum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        num1.setText(number1);
        num1.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        lblsum.setText(number1 + "+" + number2 + "="+(n1 + n2));
    }
    public void subs(View view) {
        lblsum.setText(number1 + "-" + number2 + "=" + (n1 - n2));
    }
    public void multi(View view) {
        lblsum.setText(number1 + "*" + number2 + "=" + (n1 * n2));
    }
    public void div(View view) {
        lblsum.setText(number1 + "/" + number2 + "=" + (n1 / n2));
    }
}