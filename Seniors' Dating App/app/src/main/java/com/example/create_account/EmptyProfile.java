package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmptyProfile extends AppCompatActivity {
    Button matchbtn6;
    Button chatbtn6;
    Button profilebtn6;
    Button settingsbtn6;
    Button chatbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_profile);
        matchbtn6 = (Button) findViewById(R.id.matchbutton6);
        matchbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchActivity4();
            }
        });

        chatbtn2 = (Button) findViewById(R.id.chatbutton5);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        chatbtn6 = (Button) findViewById(R.id.chatbutton6);
        profilebtn6 = (Button) findViewById(R.id.profilebutton6);
        settingsbtn6 = (Button) findViewById(R.id.settingsbutton6);

        settingsbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });
    }

    private void openMatchActivity4() {
        Intent intent = new Intent(this,person4_profile.class);
        startActivity(intent);
    }
    private void openMyChat() {
        Intent intent = new Intent(this,ChatMain.class);
        startActivity(intent);
    }
    private void openSettingsActivity() {
        Intent intent = new Intent(this,SettingsMain.class);
        startActivity(intent);
    }
}