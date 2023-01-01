package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucMatch extends AppCompatActivity {
    Button contButton;
    Button chatBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suc_match);

        contButton = (Button) findViewById(R.id.contMatch_button);
        contButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchProfile2();

            }
        });
        chatBtn = (Button) findViewById(R.id.chat_button);
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChatActivity();

            }
        });
    }

    private void openMatchProfile2() {
        Intent intent = new Intent(this,person2_profile.class);
        startActivity(intent);
    }
    private void openChatActivity() {
        Intent intent = new Intent(this,ChatMain.class);
        startActivity(intent);
    }
}