package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class person2_profile extends AppCompatActivity {
    Button backbutton2;
    Button likebutton2;
    Button skipbutton2;
    Button filterbutton2;
    int profileNum = 2;
    Button settingsbtn2;
    Button chatbtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person2_profile);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        chatbtn2 = (Button) findViewById(R.id.chatbutton3);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        ViewPager viewPager2 = findViewById(R.id.viewPager2);
        Adapter2 adapter = new Adapter2(this);
        viewPager2.setAdapter(adapter);

        settingsbtn2 = (Button) findViewById(R.id.settingsbutton3);
        settingsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });

        backbutton2 = (Button) findViewById(R.id.backbtn2);
        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    Toast.makeText(getApplicationContext(),"This is your first filtered profile. ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),person3_profile.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    //startActivity(intent);
                }else{
                    openMatchProfile1();
                }

                //openMatchProfile1();

                /*
                if (profileNum == 2){
                    openMatchProfile1();
                }*/

            }
        });

        skipbutton2 = (Button) findViewById(R.id.skipbtn2);
        skipbutton2.setOnClickListener(new View.OnClickListener() {
            Random rand = new Random();
            int numProfile2 = rand.nextInt(2)+1;

            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    Intent intent = new Intent(getApplicationContext(),person3_profile.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    openMatchProfile3();
                }
            }
        });

        likebutton2 = (Button) findViewById(R.id.likebtn2);
        likebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("male")){
                    Intent intent = new Intent(getApplicationContext(),person3_profile.class);
                    Bundle bundle = new Bundle();
                    //Toast.makeText(getApplicationContext(),filter+"before",Toast.LENGTH_LONG).show();

                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    openMatchProfile3();
                }
            }
        });

        filterbutton2 = (Button) findViewById(R.id.filter_button2);
        filterbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilter();
            }
        });
    }

    private void openMatchProfile1() {
        Intent intent = new Intent(this,person1_profile.class);
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