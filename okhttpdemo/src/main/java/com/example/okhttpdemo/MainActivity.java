package com.example.okhttpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import okhttp3.OkHttpClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doGet(View view){
        //Toast.makeText(MainActivity.this,"sdfwe", Toast.LENGTH_SHORT).show();
        //System.out.println("sdfwefsdfwfwww!!!!");

        OkHttpClient okHttpClient = new OkHttpClient();

    }
}
