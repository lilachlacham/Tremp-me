package com.example.trempme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CarsAdapter extends BaseAdapter {

    Context context;
    Car cars[];
    LayoutInflater inflater;

    public CarsAdapter(Context context, Car cars[]) {
        this.context = context;
        this.cars = cars;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return cars.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_car_item,null);
        TextView car_name_tv = (TextView) convertView.findViewById(R.id.car_name_tv);
        TextView car_number_tv = (TextView) convertView.findViewById(R.id.car_number_tv);
        TextView car_type_tv = (TextView) convertView.findViewById(R.id.car_type_tv);
        car_name_tv.setText(cars[position].getNickName());
        car_number_tv.setText(cars[position].getCarID());
        car_type_tv.setText(cars[position].getCarType());
        return convertView;
    }
}
