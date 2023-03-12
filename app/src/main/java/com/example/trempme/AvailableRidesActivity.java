package com.example.trempme;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trempme.databinding.ActivityAvailableRidesBinding;

import java.util.ArrayList;
import java.util.List;

public class AvailableRidesActivity extends AppCompatActivity {
    private ActivityAvailableRidesBinding binding;
    Car car = new Car("2824958", "mazda", "white","lilach car");
    Passenger driver = new Passenger(1, "Lilach", "computer");
    String[] pickupTimes = {"10:30", "14:00"};

    Ride rides[] = {new Ride(1, driver, car, 4, pickupTimes), new Ride(2, driver, car, 2, pickupTimes)};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAvailableRidesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listView = (ListView) findViewById(R.id.customAvailableRideListView);
        AvailableRidesAdapter availableRidesAdapterAdapter = new AvailableRidesAdapter(getApplicationContext(), rides);
        listView.setAdapter(availableRidesAdapterAdapter);
    }
}
