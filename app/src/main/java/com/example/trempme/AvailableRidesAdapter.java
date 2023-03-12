package com.example.trempme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AvailableRidesAdapter extends BaseAdapter {
    Context context;
    Ride[] rides;
    LayoutInflater inflater;

    public AvailableRidesAdapter(Context context, Ride[] rides){
        this.context = context;
        this.rides = rides;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return rides.length;
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
        convertView = inflater.inflate(R.layout.activity_custom_available_ride_item, null);
        TextView driver_name_tv = (TextView) convertView.findViewById(R.id.driver_name_tv);
        TextView pickup_time_tv = (TextView) convertView.findViewById(R.id.pickup_time_tv);
        driver_name_tv.setText(rides[position].getDriver().getUserName());
        //pickup_time_tv.setText(rides[position].getPickupTimes()[position]);
        pickup_time_tv.setText("10:30");
        return convertView;
    }
}
