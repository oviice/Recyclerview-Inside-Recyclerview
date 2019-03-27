package com.bdtask.recyclerviewinsiderecyclerview;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.bdtask.recyclerviewinsiderecyclerview.retrofit.AppConfig;
import com.bdtask.recyclerviewinsiderecyclerview.retrofit.ChefService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView OrderRecyclerView;
    ChefService chefService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chefService = AppConfig.getRetrofit().create(ChefService.class);

        OrderRecyclerView =findViewById(R.id.OrderRecyclerViewId);
        OrderRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        getOrderList();
    }
    private void getOrderList() {
        chefService.getOrderList("171").enqueue(new Callback<com.bdtask.recyclerviewinsiderecyclerview.Response>() {
            @Override
            public void onResponse(Call<com.bdtask.recyclerviewinsiderecyclerview.Response> call, Response<com.bdtask.recyclerviewinsiderecyclerview.Response> response) {
                if (response.body().getStatus().equals("success")) {
                    try {
                        Log.d("ppp", "onResponse: " + response.body().getMessage());
                        List<OrderinfoItem> items = response.body().getData().getOrderinfo();
                        OrderRecyclerView.setAdapter(new OrderAdapter(MainActivity.this, items));


                    } catch (Exception e) {
                        Log.d("ppp", "onResponse: " + e.getLocalizedMessage());
                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<com.bdtask.recyclerviewinsiderecyclerview.Response> call, Throwable t) {
                Log.d("ppp", "onFailure: "+t.getLocalizedMessage());
            }
        });
    }
}
