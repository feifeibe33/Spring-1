package com.wenrui.spring.beans;


import java.util.Map;

/**
 * Created by weiwei on 2016/8/14.
 */
public class PersonMap {
    private String name ;
    private int age ;
    private Map<String,Car> cars ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PersonMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
