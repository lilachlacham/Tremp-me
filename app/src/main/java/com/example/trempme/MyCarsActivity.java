package com.example.trempme;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.trempme.databinding.ActivityMyCarsBinding;

import java.util.List;

public class MyCarsActivity extends AppCompatActivity {
    private ActivityMyCarsBinding binding;
    Car cars[] = {new Car("2824958", "mazda", "white","lilach car"), new Car("111111", "mazda", "white","my car")};
    //List<Car> cars;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMyCarsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        listView = (ListView) findViewById(R.id.carsListView);
        CarsAdapter carsAdapter = new CarsAdapter(getApplicationContext(), cars);
        listView.setAdapter(carsAdapter);
    }
}
