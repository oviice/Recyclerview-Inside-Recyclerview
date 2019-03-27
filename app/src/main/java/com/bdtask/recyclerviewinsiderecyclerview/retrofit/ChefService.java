package com.bdtask.recyclerviewinsiderecyclerview.retrofit;


import com.bdtask.recyclerviewinsiderecyclerview.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ChefService {
    @FormUrlEncoded
    @POST("orderlist")
    Call<Response> getOrderList(@Field("id") String id);
}
