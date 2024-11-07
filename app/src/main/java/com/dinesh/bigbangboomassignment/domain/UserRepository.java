package com.dinesh.bigbangboomassignment.domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.dinesh.bigbangboomassignment.data.api.ApiClient;
import com.dinesh.bigbangboomassignment.data.api.ApiService;
import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository() {
        apiService = ApiClient.getClient().create(ApiService.class);
    }

    public LiveData<String> registerUser(User user) {
        MutableLiveData<String> data = new MutableLiveData<>();
        apiService.registerUser(user).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                data.setValue(response.body());
            }
            @Override
            public void onFailure(Call<String> call, Throwable t) {
                data.setValue("Error: " + t.getMessage());
            }
        });
        return data;
    }

    public LiveData<String> captureData(UserData userData) {
        MutableLiveData<String> data = new MutableLiveData<>();
        apiService.captureData(userData).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                data.setValue(response.body());
            }
            @Override
            public void onFailure(Call<String> call, Throwable t) {
                data.setValue("Error: " + t.getMessage());
            }
        });
        return data;
    }




}
