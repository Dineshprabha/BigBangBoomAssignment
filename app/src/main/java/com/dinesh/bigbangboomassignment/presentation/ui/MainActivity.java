package com.dinesh.bigbangboomassignment.presentation.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dinesh.bigbangboomassignment.R;
import com.dinesh.bigbangboomassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}