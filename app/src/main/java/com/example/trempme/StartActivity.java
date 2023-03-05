package com.example.trempme;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trempme.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {
    private ActivityStartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.availableRidesBtn.setOnClickListener(v ->{
            Intent i = new Intent(this,AvailableRidesActivity.class);
            startActivity(i);
        });

        binding.historyRidesBtn.setOnClickListener(v -> {
            Intent i = new Intent(this,HistoryRidesActivity.class);
            startActivity(i);
        });
    }
}
