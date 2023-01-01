package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class More extends AppCompatActivity {

    Button unmatch;
    Button report;
    Button block;
    Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        more = (Button) findViewById(R.id.backm);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chat2.class);
                startActivity(intent);
            }
        });

        unmatch = (Button) findViewById(R.id.unmatch);
        report = (Button) findViewById(R.id.report);
        block = (Button) findViewById(R.id.block);

        unmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Unmatched with Morgan Freeman",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                Bundle bundle = new Bundle();
                bundle.putString("unmatch","unmatchmorgan");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reported Morgan Freeman",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                startActivity(intent);
            }
        });

        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Blocked Morgan Freeman",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                startActivity(intent);
            }
        });
    }
}