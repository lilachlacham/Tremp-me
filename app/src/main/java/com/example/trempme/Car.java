package com.example.trempme;

public class Car {
    private String carID;
    private String carType;
    private String color;
    private String nickName;

    public Car(String carID, String carType, String color, String nickName) {
        this.carID = carID;
        this.carType = carType;
        this.color = color;
        this.nickName = nickName;
    }


    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
