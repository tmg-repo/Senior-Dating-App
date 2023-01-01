package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsMain extends AppCompatActivity {
    Button matchbtn3;
    Button chatbtn2;
    Button profilebtn3;
    Button settingsbtn3;

    Button verificationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_main);

        verificationBtn = (Button) findViewById(R.id.button6);
        verificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVerification();
            }
        });

        chatbtn2 = (Button) findViewById(R.id.chatbutton2);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        matchbtn3 = (Button) findViewById(R.id.matchbutton2);
        matchbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchActivity();
            }
        });


        profilebtn3 = (Button) findViewById(R.id.profilebutton2);

        settingsbtn3 = (Button) findViewById(R.id.settingsbutton2);
        settingsbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });
    }
    private void openMatchActivity() {
        Intent intent = new Intent(this,person1_profile.class);
        startActivity(intent);
    }


    private void openSettingsActivity() {
        Intent intent = new Intent(this,SettingsMain.class);
        startActivity(intent);
    }
    private void openMyChat() {
        Intent intent = new Intent(this,ChatMain.class);
        startActivity(intent);
    }

    private void openVerification() {
        Intent intent = new Intent(this, Settings1.class);
        startActivity(intent);
    }
}