package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class person4_profile extends AppCompatActivity {
    Button backbutton4;
    Button likebutton4;
    Button skipbutton4;
    Button filterbutton4;
    int profileNum = 4;

    Button settingsbtn2;
    Button chatbtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person4_profile);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ViewPager viewPager4 = findViewById(R.id.viewPager4);
        Adapter4 adapter = new Adapter4(this);
        viewPager4.setAdapter(adapter);

        chatbtn2 = (Button) findViewById(R.id.chatbutton6);
        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });

        settingsbtn2 = (Button) findViewById(R.id.settingsbutton7);
        settingsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });

        backbutton4 = (Button) findViewById(R.id.backbtn4);
        backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("female")){
                    //Toast.makeText(getApplicationContext(),"This is your first filtered profile. ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),person1_profile.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else{
                    openMatchProfile3();
                }

            }
        });
        likebutton4 = (Button) findViewById(R.id.likebtn4);
        likebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuccessMatch4();

            }
        });

        skipbutton4 = (Button) findViewById(R.id.skipbtn4);
        skipbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"No more people left to match ",Toast.LENGTH_LONG).show();
            }
        });
        filterbutton4 = (Button) findViewById(R.id.filter_button4);
        filterbutton4.setOnClickListener(new View.OnClickListener() {
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
    private void openSuccessMatch4() {
        Intent intent = new Intent(this,SucMatch4.class);
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