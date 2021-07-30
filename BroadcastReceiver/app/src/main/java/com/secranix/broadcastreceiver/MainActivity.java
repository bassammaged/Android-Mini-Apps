package com.secranix.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter IntentFilterObject = new IntentFilter("com.secranix.broadcastsender.heartest");
        MyReceiver MyReceiverObject     = new MyReceiver();
        registerReceiver(MyReceiverObject,IntentFilterObject);
    }
}