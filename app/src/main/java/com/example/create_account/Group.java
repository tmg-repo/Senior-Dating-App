package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Group extends AppCompatActivity {
    Button back;
    CheckBox alex;
    CheckBox morgan;
    Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        alex = (CheckBox) findViewById(R.id.checkBox4);
        morgan = (CheckBox) findViewById(R.id.checkBox5);

        back = (Button) findViewById(R.id.backg);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatMain.class);
                startActivity(intent);
            }
        });

        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alex.isChecked() || morgan.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), ChatMain.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Please select someone to invite",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}