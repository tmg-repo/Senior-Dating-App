package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class person1_profile extends AppCompatActivity {
    Button backbutton;
    Button likebutton;
    Button skipbutton;

    Button filterbutton;
    String filter = "false";

    Button matchbtn2;
    Button chatbtn2;
    Button profilebtn2;
    Button settingsbtn2;

    int profileNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person1_profile);

        matchbtn2 = (Button) findViewById(R.id.matchbutton2);
        matchbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMatchActivity();
            }
        });

        chatbtn2 = (Button) findViewById(R.id.chatbutton2);

        profilebtn2 = (Button) findViewById(R.id.profilebutton2);

        settingsbtn2 = (Button) findViewById(R.id.settingsbutton2);
        settingsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });

        chatbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyChat();
            }
        });


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ViewPager viewPager = findViewById(R.id.viewPager);
        Adapter adapter = new Adapter(this);
        viewPager.setAdapter(adapter);

        backbutton = (Button) findViewById(R.id.backbtn) ;
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filter = "false";
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter,Toast.LENGTH_LONG).show();
                if(filter.equals("female")){
                    Toast.makeText(getApplicationContext(),"This is your first filtered profile. ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),person4_profile.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("filter",filter);
                    intent.putExtras(bundle);
                    //startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"This is your first profile. ",Toast.LENGTH_LONG).show();
                }
            }
        });

        skipbutton = (Button) findViewById(R.id.skipbtn);
        skipbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(bundle != null){
                    filter = bundle.getString("filter");
                }
                //Toast.makeText(getApplicationContext(),filter + " test1",Toast.LENGTH_LONG).show();
                if(filter.equals("female")){
                    Intent intent = new Intent(getApplicationContext(),person4_profile.class);
                    startActivity(intent);
                }else{
                    openMatchProfile2();
                }


            }
        });

        likebutton = (Button) findViewById(R.id.likebtn);
        likebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuccessMatch1();

            }
        });

        filterbutton = (Button) findViewById(R.id.filter_button);
        filterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilter();
            }
        });


    }

    private void openSuccessMatch1() {
        Intent intent = new Intent(this,SucMatch.class);
        startActivity(intent);
    }

    private void openMatchProfile2() {
        Intent intent = new Intent(this,person2_profile.class);
        startActivity(intent);
    }
    private void openMatchProfile4() {
        Intent intent = new Intent(this,person4_profile.class);
        startActivity(intent);
    }

    private void openFilter() {
        Intent intent = new Intent(this,Filter_UI.class);
        //Intent intent = new Intent(this,Filter_RecyclerView.class);
        startActivity(intent);
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
}