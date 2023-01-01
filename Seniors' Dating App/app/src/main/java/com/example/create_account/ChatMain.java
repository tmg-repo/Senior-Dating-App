package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatMain extends AppCompatActivity {


    Button Chat1;
    Button Chat2;
    Button invite;Button Group;
    String status="none";
    ImageView image1;ImageView image2;
    TextView name1;TextView name2;
    TextView prev2;
    TextView prev1;
    Button chat1; Button chat2;
    Button Matching;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_main);

        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageViewm);
        name1 = (TextView) findViewById(R.id.name1);
        name2 = (TextView) findViewById(R.id.name2);
        prev2 = (TextView) findViewById(R.id.preview2);
        prev1 = (TextView) findViewById(R.id.preview1);
        Chat2 = (Button) findViewById(R.id.Chat2);
        Chat1 = (Button) findViewById(R.id.chat1);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            status = bundle.getString("unmatch");
        }
        if(status.equals("unmatchalex")){
            image1.setVisibility(View.GONE);
            name1.setVisibility(View.GONE);
            prev1.setVisibility(View.GONE);
            Chat1.setVisibility(View.GONE);
        }
        if(status.equals("unmatchmorgan")){
            image2.setVisibility(View.GONE);
            name2.setVisibility(View.GONE);
            prev2.setVisibility(View.GONE);
            Chat2.setVisibility(View.GONE);
        }

        Matching = (Button) findViewById(R.id.Matching);
        Matching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person1_profile.class);
                startActivity(intent);
            }
        });

        invite = (Button) findViewById(R.id.Invites);
        Group = (Button) findViewById(R.id.CreateGroup);
        Chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chat2.class);
                startActivity(intent);
            }
        });


        Chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chat1.class);
                startActivity(intent);
            }
        });

        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Invites.class);
                startActivity(intent);
            }
        });

        Group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Group.class);
                startActivity(intent);
            }
        });
    }
}