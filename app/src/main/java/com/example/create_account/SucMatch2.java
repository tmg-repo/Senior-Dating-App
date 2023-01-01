package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucMatch2 extends AppCompatActivity {
    Button contButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suc_match2);
        contButton2 = (Button) findViewById(R.id.contMatch_button2);
        contButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchProfile3();

            }
        });
    }
    private void openMatchProfile3() {
        Intent intent = new Intent(this,person3_profile.class);
        startActivity(intent);
    }
}