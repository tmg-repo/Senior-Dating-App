package com.example.create_account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Chat1 extends AppCompatActivity {

    Button Back;

    int counter=0;
    TextView firstmsg;
    TextView secondsmsg;
    TextView thirdmsg;
    EditText chatbox1;
    Button send;
    Button more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat1);


        firstmsg = (TextView) findViewById(R.id.first);
        secondsmsg = (TextView) findViewById(R.id.second);
        thirdmsg = (TextView) findViewById(R.id.third);
        chatbox1 = (EditText) findViewById(R.id.chatbox);
        send = (Button) findViewById(R.id.send);
        more = (Button) findViewById(R.id.more);


        String file = "chat1.txt";
        String line = "";
        String data = "";

        String line1 = "Roses are red. Violets are blue. Do you like me? Because I like you"+"\n";
        String line2 = "Wow that was smooth"+"\n";

        FileOutputStream outputStream;  //Allow a file to be opened for writing

        try {
            outputStream = openFileOutput(file, Context.MODE_APPEND);
            outputStream.write(line1.getBytes());
            outputStream.write(line2.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = openFileInput(file);  //A FileInputStream obtains input bytes from a file in a file system
            InputStreamReader isr = new InputStreamReader(fis); //An InputStreamReader is a bridge from byte streams to character streams
            BufferedReader br = new BufferedReader(isr);    //Reads text from a character-input stream,
            while ((line = br.readLine()) != null) {
                data += line+",";
                counter++;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        String[] eachdata = data.split(",");
        firstmsg.setText(eachdata[0]);
        secondsmsg.setText(eachdata[1]);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String current = thirdmsg.getText().toString();
                current += "\n"+chatbox1.getText().toString();
                thirdmsg.setText(current);
            }
        });


        Back = (Button) findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChatMain.class);
                startActivity(intent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),More2.class);
                startActivity(intent);
            }
        });
    }
}