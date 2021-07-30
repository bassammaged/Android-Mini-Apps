package com.secranix.deeplinking;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri     = getIntent().getData();

        if (uri != null) {
            Toast.makeText(this,"uri="+uri, Toast.LENGTH_LONG).show();
            Toast.makeText(this,"id="+uri.getQueryParameter("id")+" & name="+uri.getQueryParameter("name"), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"You open the application directly!",Toast.LENGTH_LONG).show();
        }
    }
}