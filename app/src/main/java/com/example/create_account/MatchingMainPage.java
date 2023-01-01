package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MatchingMainPage extends AppCompatActivity {
    Button matchbtn;
    Button chatbtn;
    Button profilebtn;
    Button settingsbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_main_page);

        matchbtn = (Button) findViewById(R.id.matchbutton);
        matchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchActivity();
            }
        });
    }

    private void openMatchActivity() {
        Intent intent = new Intent(this,person1_profile.class);
        startActivity(intent);
    }
}