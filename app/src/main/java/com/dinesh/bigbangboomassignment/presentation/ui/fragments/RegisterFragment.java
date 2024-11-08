package com.dinesh.bigbangboomassignment.presentation.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dinesh.bigbangboomassignment.R;
import com.dinesh.bigbangboomassignment.data.model.User;
import com.dinesh.bigbangboomassignment.data.model.UserResponse;
import com.dinesh.bigbangboomassignment.databinding.FragmentRegisterBinding;
import com.dinesh.bigbangboomassignment.presentation.viewmodel.UserViewModel;
import com.google.gson.Gson;

public class RegisterFragment extends Fragment {
    private FragmentRegisterBinding binding;
    private UserViewModel userViewModel;
    private Gson gson;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegisterBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        binding.btnSignUp.setOnClickListener( v ->{
            String username = binding.editTextEmail.getText().toString();
            String password = binding.editTextPassword.getText().toString();

            User userRequest = new User(username, password);
            Log.i("UserData:", gson.toJson(userRequest));

            userViewModel.registerUser(userRequest).observe(getViewLifecycleOwner(), new Observer<UserResponse>() {
                @Override
                public void onChanged(UserResponse userResponse) {
                    Log.i("UserData:", gson.toJson(userResponse));
                    if (userResponse != null) {
                        Toast.makeText(getContext(), "User Registered: " + userResponse.getUsername(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getContext(), "Registration failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        });
    }
}