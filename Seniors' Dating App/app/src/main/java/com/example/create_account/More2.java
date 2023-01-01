package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class More2 extends AppCompatActivity {

    Button unmatch;
    Button report;
    Button block;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more2);

        unmatch = (Button) findViewById(R.id.unmatch2);
        report = (Button) findViewById(R.id.report2);
        block = (Button) findViewById(R.id.block2);
        back = (Button) findViewById(R.id.backm2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chat1.class);
                startActivity(intent);
            }
        });

        unmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Unmatched with Alex Ron",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                Bundle bundle = new Bundle();
                bundle.putString("unmatch","unmatchalex");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reported Alex Ron",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                startActivity(intent);
            }
        });

        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Blocked Alex Ron",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                startActivity(intent);
            }
        });
    }
}
