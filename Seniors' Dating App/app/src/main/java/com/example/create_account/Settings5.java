package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings5 extends AppCompatActivity {
    Button matchbtn7;
    Button chatbtn2;
    Button profilebtn7;
    Button settingsbtn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings5);

        matchbtn7 = (Button) findViewById(R.id.matchbutton5);
        matchbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMatchActivity();
            }
        });

        chatbtn2 = (Button) findViewById(R.id.chatbutton7);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        settingsbtn7 = (Button) findViewById(R.id.settingsbutton5);
        settingsbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
    }
    private void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsMain.class);
        startActivity(intent);
    }
    private void openMatchActivity() {
        Intent intent = new Intent(this, person1_profile.class);
        startActivity(intent);
    }
    private void openMyChat() {
        Intent intent = new Intent(this,ChatMain.class);
        startActivity(intent);
    }
}