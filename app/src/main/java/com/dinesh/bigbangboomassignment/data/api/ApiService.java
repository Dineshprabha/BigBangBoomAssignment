package com.dinesh.bigbangboomassignment.data.api;

import com.dinesh.bigbangboomassignment.data.model.LoginResponse;
import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;
import com.dinesh.bigbangboomassignment.data.model.UserResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/api/register")
    Call<UserResponse> registerUser(@Body User userRequest);

    @POST("/api/login")
    Call<LoginResponse> loginUser(@Body User userRequest);
}
