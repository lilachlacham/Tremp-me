package com.example.trempme;

import java.util.List;

public class Ride {
    int id;
    Passenger driver;
    Car car;
    int capacity;
    List<Passenger> passengers;
    boolean active;
    String source;
    String dest;
    List<String> stations;
    String[] pickupTimes;

    public Ride(int id, Passenger driver, Car car, int capacity, String[] pickupTimes) {
        this.id = id;
        this.driver = driver;
        this.car = car;
        this.capacity = capacity;
        this.pickupTimes = pickupTimes;
    }
    public Ride(int id, Passenger driver, Car car, int capacity) {
        this.id = id;
        this.driver = driver;
        this.car = car;
        this.capacity = capacity;
    }

    public String[] getPickupTimes() {
        return pickupTimes;
    }

    public void setPickupTimes(String[] pickupTimes) {
        this.pickupTimes = pickupTimes;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passenger getDriver() {
        return driver;
    }

    public void setDriver(Passenger driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
