package com.dinesh.bigbangboomassignment.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserData;
import com.dinesh.bigbangboomassignment.domain.UserRepository;

public class UserViewModel extends ViewModel {
    private final UserRepository userRepository;
    private LiveData<String> registerResponse;
    private LiveData<String> captureDataResponse;

    public UserViewModel() {
        userRepository = new UserRepository();
    }

    public LiveData<String> registerUser(User user) {
        registerResponse = userRepository.registerUser(user);
        return registerResponse;
    }

    public LiveData<String> captureData(UserData userData) {
        captureDataResponse = userRepository.captureData(userData);
        return captureDataResponse;
    }
}
