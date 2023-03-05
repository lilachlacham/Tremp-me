package com.example.trempme;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trempme.databinding.ActivityAvilableRidesBinding;

public class AvailableRidesActivity extends AppCompatActivity {
    private ActivityAvilableRidesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAvilableRidesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
