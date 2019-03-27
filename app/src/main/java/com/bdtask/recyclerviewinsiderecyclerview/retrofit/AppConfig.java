package com.bdtask.recyclerviewinsiderecyclerview.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppConfig {

    public static String BASE_URL = "http://soft14.bdtask.com/V3/";

    public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
