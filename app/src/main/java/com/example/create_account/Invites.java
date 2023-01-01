package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Invites extends AppCompatActivity {


    Button back;
    Button A1;
    Button A2;
    Button D1;
    Button D2;
    TextView gaming;
    TextView football;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invites);

        back = (Button) findViewById(R.id.backi);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatMain.class);
                startActivity(intent);
            }
        });

        A1 = (Button) findViewById(R.id.accept);
        A2 = (Button) findViewById(R.id.accept2);
        D1 = (Button) findViewById(R.id.decline);
        D2 = (Button) findViewById(R.id.decline2);
        gaming = (TextView) findViewById(R.id.gaming);
        football = (TextView) findViewById(R.id.football);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Accepted Invite",Toast.LENGTH_LONG).show();
                A1.setVisibility(View.GONE);
                gaming.setVisibility(View.GONE);
                D1.setVisibility(View.GONE);
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Accepted Invite",Toast.LENGTH_LONG).show();
                A2.setVisibility(View.GONE);
                football.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
            }
        });

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Declined Invite",Toast.LENGTH_LONG).show();
                A1.setVisibility(View.GONE);
                gaming.setVisibility(View.GONE);
                D1.setVisibility(View.GONE);
            }
        });

        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Declined Invite",Toast.LENGTH_LONG).show();
                A2.setVisibility(View.GONE);
                football.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
            }
        });

    }
}