package com.wenrui.spring.beans;

import java.util.List;

/**
 * Created by weiwei on 2016/8/14.
 */
public class PersonList {
    private String name ;
    private int age ;
    private List<Car> cars ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public PersonList(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
