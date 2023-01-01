package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class person3_profile extends AppCompatActivity {
    Button backbutton3;
    Button likebutton3;
    Button skipbutton3;
    Button filterbutton3;
    int profileNum = 3;

    Button settingsbtn2;
    Button chatbtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person3_profile);

        ViewPager viewPager3 = findViewById(R.id.viewPager3);
        Adapter3 adapter = new Adapter3(this);
        viewPager3.setAdapter(adapter);

        chatbtn2 = (Button) findViewById(R.id.chatbutton4);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        settingsbtn2 = (Button) findViewById(R.id.settingsbutton4);
        settingsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });

        backbutton3 = (Button) findViewById(R.id.backbtn3);
        backbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    //Toast.makeText(getApplicationContext(),"This is your first filtered profile. ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),person2_profile.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else{
                    openMatchProfile2();
                }

                /*if (profileNum == 3){
                    openMatchProfile2();
                }*/

            }
        });

        skipbutton3 = (Button) findViewById(R.id.skipbtn3);
        skipbutton3.setOnClickListener(new View.OnClickListener() {
            Random rand = new Random();
            int numProfile2 = rand.nextInt(1)+1;

            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter +"test2",Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    Toast.makeText(getApplicationContext(),"No more people left to match ",Toast.LENGTH_LONG).show();
                }else {
                    openMatchProfile4();
                }
            }
        });
        likebutton3 = (Button) findViewById(R.id.likebtn3);
        likebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    Toast.makeText(getApplicationContext(),"No more people left to match ",Toast.LENGTH_LONG).show();
                }else {
                    openMatchProfile4();
                }
            }
        });

        filterbutton3 = (Button) findViewById(R.id.filter_button3);
        filterbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilter();
            }
        });
    }
    private void openMatchProfile2() {
        Intent intent = new Intent(this,person2_profile.class);
        startActivity(intent);
    }
    private void openMatchProfile3() {
        Intent intent = new Intent(this,person3_profile.class);
        startActivity(intent);
    }

    private void openMatchProfile4() {
        Intent intent = new Intent(this,person4_profile.class);
        startActivity(intent);
    }
    private void openFilter() {
        Intent intent = new Intent(this,Filter_UI.class);
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
}