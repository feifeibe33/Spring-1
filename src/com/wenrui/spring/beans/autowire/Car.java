package com.wenrui.spring.beans.autowire;

/**
 * Created by weiwei on 2016/8/14.
 */
public class Car {


    private String band;
    private String corp;
    private int price;


    public Car(String band, String corp, int price) {
        this.band = band;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                '}';

    }
}
