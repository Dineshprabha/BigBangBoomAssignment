package com.dinesh.bigbangboomassignment.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.dinesh.bigbangboomassignment.data.model.LoginResponse;
import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;
import com.dinesh.bigbangboomassignment.data.model.UserResponse;
import com.dinesh.bigbangboomassignment.domain.UserRepository;

public class UserViewModel extends ViewModel {
    private final UserRepository userRepository;


    public UserViewModel() {
        userRepository = new UserRepository();
    }
    private LiveData<UserResponse> userResponseLiveData;


    public LiveData<UserResponse> registerUser(User userRequest) {
        return userRepository.registerUser(userRequest);
    }

    public LiveData<UserResponse> getUserResponseLiveData() {
        return userResponseLiveData;
    }

    public LiveData<LoginResponse> loginUser(User userRequest) {
        return userRepository.loginUser(userRequest);
    }
}
