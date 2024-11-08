package com.dinesh.bigbangboomassignment.domain;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.dinesh.bigbangboomassignment.data.api.ApiClient;
import com.dinesh.bigbangboomassignment.data.api.ApiService;
import com.dinesh.bigbangboomassignment.data.model.LoginResponse;
import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;
import com.dinesh.bigbangboomassignment.data.model.UserResponse;
import com.google.gson.Gson;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    private final ApiService apiService;
    private Gson gson;

    public UserRepository() {
        apiService = ApiClient.getClient().create(ApiService.class);
    }

    public LiveData<UserResponse> registerUser(User userRequest) {
        MutableLiveData<UserResponse> data = new MutableLiveData<>();
//        Log.i("UserData1:", gson.toJson(data));
        apiService.registerUser(userRequest).enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.isSuccessful()) {
//                    Log.i("UserData1:", gson.toJson(response));
                    data.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
//                Log.i("UserData1:", gson.toJson(data));
                data.postValue(null);
            }
        });

        return data;
    }

    public LiveData<LoginResponse> loginUser(User userRequest) {
        MutableLiveData<LoginResponse> data = new MutableLiveData<>();

        apiService.loginUser(userRequest).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    data.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                data.postValue(null);
            }
        });

        return data;
    }




}
