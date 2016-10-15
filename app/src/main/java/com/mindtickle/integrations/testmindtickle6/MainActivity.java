package com.mindtickle.integrations.testmindtickle6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mindtickle.integrations.android_sdk.MindTickle;
import com.mindtickle.integrations.android_sdk.exceptions.MindTickleNotInitializedException;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            MindTickle.setUserEmail("rachit.agarwal@mindtickle.com");
        } catch (JSONException | MindTickleNotInitializedException e) {
            e.printStackTrace();
        }
        findViewById(R.id.mtbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    MindTickle.openMindTickle();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.dummy1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"dummy1 clicked",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.dummy2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"dummy2 clicked",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.dummy3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"dummy3 clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
