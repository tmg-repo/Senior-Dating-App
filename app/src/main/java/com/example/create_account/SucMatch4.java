package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucMatch4 extends AppCompatActivity {
    Button contButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suc_match4);

        contButton4 = (Button) findViewById(R.id.contMatch_button2);
        contButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchProfile5();

            }
        });
    }
    private void openMatchProfile5() {
        Intent intent = new Intent(this,EmptyProfile.class);
        startActivity(intent);
    }
}