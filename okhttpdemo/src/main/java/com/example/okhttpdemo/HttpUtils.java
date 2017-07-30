package com.example.okhttpdemo;

import okhttp3.OkHttpClient;

/**
 * Created by husonghua on 2017/7/30.
 */

public class HttpUtils {
    private static OkHttpClient client = null;

    private HttpUtils() {}

    public static OkHttpClient getInstence() {
        if (client == null){
            synchronized(HttpUtils.class){
                if(client == null){
                    client = new OkHttpClient();
                }
            }
        }
        return client;
    }



}
