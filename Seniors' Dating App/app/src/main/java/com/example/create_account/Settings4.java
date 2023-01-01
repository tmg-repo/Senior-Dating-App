package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings4 extends AppCompatActivity {
    Button buttonback4;
    Button buttonemail;
    Button buttonFinish;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings4);
        buttonback4 = (Button) findViewById(R.id.buttonback4);
        buttonemail = (Button) findViewById(R.id.buttonemail);
        buttonFinish = (Button) findViewById(R.id.buttonfinish);
        buttonemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Settings4.this, "Email has been re-sent",
                        Toast.LENGTH_LONG).show();
            }
        });
        buttonback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings4.this, Settings5.class);
                startActivity(intent);
            }
        });
    }
}