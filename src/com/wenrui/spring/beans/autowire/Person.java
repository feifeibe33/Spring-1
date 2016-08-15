package com.wenrui.spring.beans.autowire;

/**
 * Created by weiwei on 2016/8/14.
 */
public class Person {
    private String name;
    private int age ;
    private Car car ;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
