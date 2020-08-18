package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

    }

    public void openSecond(View view){
        Intent intent = new Intent(MainActivity.this, ScondActivity.class);
        intent.putExtra("n1", num1.getText());
        intent.putExtra("n2", num2.getText());
        Toast.makeText(this, "OPENING CALCULATOR", Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }

    public void OnclickButtonLister() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Sending Massage";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.show();

                        Intent intent = new Intent(MainActivity.this, ScondActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}