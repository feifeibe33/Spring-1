package com.wenrui.spring.beans;

/**
 * Created by weiwei on 2016/8/13.
 */
public class Car {
    private String band;
    private String corp;
    private int price;
    private int maxSpeed;

    public Car(String band, String corp, int price, int maxSpeed) {
        this.band = band;
        this.corp = corp;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}

