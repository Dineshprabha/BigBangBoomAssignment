package com.dinesh.bigbangboomassignment.data.api;

import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("register")
    Call<String> registerUser(@Body User user);

    @POST("login")
    Call<ResponseBody> loginUser(@Body User user);

    @POST("capture_data")
    Call<String> captureData(@Body UserData userData);
}
