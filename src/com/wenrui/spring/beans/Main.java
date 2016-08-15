package com.wenrui.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

/**
 * Created by weiwei on 2016/8/13.
 */
public class Main {
    public static void main(String [] args){
//        HelloWorld helloworld = new HelloWorld();
//        helloworld.setName("Wuzhen");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
       PersonList person = (PersonList) ctx.getBean("person4");
      //  Car car = (Car) ctx.getBean("car");
       System.out.println(person);
      //  DataSource dataSource = ctx.getBean(DataSource.class);
       // System.out.println(dataSource.getProperties());


      //  helloworld.hello();
    }
}
