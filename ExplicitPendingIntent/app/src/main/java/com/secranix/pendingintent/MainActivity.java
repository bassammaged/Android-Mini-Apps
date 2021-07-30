package com.secranix.pendingintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PendingWithNotification(View v){
        Intent IntentObject             = new Intent(MainActivity.this,NotificationActivity.class);
        PendingIntent PendingObject     = PendingIntent.getActivity(MainActivity.this,0,IntentObject,0);
        Notification NotificationObject = new NotificationCompat.Builder(this).setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Test the pending intent").setContentText("Open NotificationActivity.class :)").setAutoCancel(true)
                .setContentIntent(PendingObject).build();

        NotificationManager NotificationManagerObject   = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        NotificationManagerObject.notify(1,NotificationObject);



    }


}