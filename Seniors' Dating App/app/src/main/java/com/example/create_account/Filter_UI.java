package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Filter_UI extends AppCompatActivity {
    Button backbtn5;
    Button applybtn;
    Button resetbtn;

    int profileNum = 5;

    RadioGroup gender;
    RadioButton female;
    String answer = "false";
    RadioButton male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_ui);

        gender = (RadioGroup) findViewById(R.id.Gender);

        female = (RadioButton) findViewById(R.id.radioButtonfemale);
        male = (RadioButton) findViewById(R.id.radioButtonmale);

        backbtn5 = (Button) findViewById(R.id.filterBack);
        backbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (profileNum == 5){
                    Intent intent = new Intent(getApplicationContext(),person1_profile.class);
                    startActivity(intent);
                }


            }
        });

        applybtn = (Button) findViewById(R.id.filterApply);
        applybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (profileNum == 5){
                    if (female.isChecked()){
                        answer = "female";
                        Intent intent = new Intent(getApplicationContext(),person1_profile.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("filter",answer);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        //Toast.makeText(getApplicationContext(),answer,Toast.LENGTH_LONG).show();
                    }
                    if (male.isChecked()){
                        answer = "male";
                        Intent intent = new Intent(getApplicationContext(),person2_profile.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("filter",answer);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        //Toast.makeText(getApplicationContext(),answer+" filter",Toast.LENGTH_LONG).show();
                    }
                    if(!female.isChecked() && !male.isChecked()){
                        answer = "none";
                        Intent intent = new Intent(getApplicationContext(),person1_profile.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("filter",answer);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }

                    //Intent intent = new Intent(getApplicationContext(),person1_profile.class);

                }
            }
        });

        resetbtn = (Button) findViewById(R.id.resetButton);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You just reset your filters back to the original settings.",Toast.LENGTH_LONG).show();
                gender.clearCheck();
                openMatchProfile1();
            }
        });
    }
    private void openMatchProfile1() {
        Intent intent = new Intent(this,person1_profile.class);
        startActivity(intent);
    }
}