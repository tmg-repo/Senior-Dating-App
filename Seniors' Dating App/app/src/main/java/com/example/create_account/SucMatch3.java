package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucMatch3 extends AppCompatActivity {
    Button contButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suc_match3);

        contButton3 = (Button) findViewById(R.id.contMatch_button3);
        contButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchProfile4();

            }
        });
    }
    private void openMatchProfile4() {
        Intent intent = new Intent(this,person4_profile.class);
        startActivity(intent);
    }
}