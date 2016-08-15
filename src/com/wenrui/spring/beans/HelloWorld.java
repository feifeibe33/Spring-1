package com.wenrui.spring.beans;

/**
 * Created by weiwei on 2016/8/13.
 */
public class HelloWorld {

    private String name ;
    public void setName(String name) {
        this.name = name;
    }
    HelloWorld(){
        System.out.println("now construcker is bulid");
    }
    public void hello(){
        System.out.println("hello :"+name);
    }
}
