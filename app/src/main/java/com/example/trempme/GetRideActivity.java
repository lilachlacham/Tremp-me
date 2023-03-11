package com.example.trempme;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trempme.databinding.ActivityGetBinding;

public class GetRideActivity extends AppCompatActivity {
    private ActivityGetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.swapBtn.setOnClickListener(v -> {
            EditText fromText = findViewById(R.id.from_et);
            String from = fromText.getText().toString();
            String fromHint = fromText.getHint().toString();
            EditText toText = findViewById(R.id.to_et);
            String to = toText.getText().toString();
            String toHint = toText.getHint().toString();
            binding.fromEt.setText(to);
            binding.toEt.setText(from);
            binding.fromEt.setHint(toHint);
            binding.toEt.setHint(fromHint);
        });
    }
}
