package com.secranix.broadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBroadcastSendBtnClicked(View v) {
        Intent intentObject = new Intent();
        intentObject.setAction("com.secranix.broadcastsender.heartest");
        intentObject.setFlags(intentObject.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intentObject);
    }
}