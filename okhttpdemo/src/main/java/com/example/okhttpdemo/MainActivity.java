package com.example.okhttpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends Activity {

    private static final String url= "http://www.imooc.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doGet(View view){
        //Toast.makeText(MainActivity.this,"sdfwe", Toast.LENGTH_SHORT).show();
        //System.out.println("sdfwefsdfwfwww!!!!");

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().get().url(url).build();

        Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                final String res = response.body().string();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this,res, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });



    }
}
