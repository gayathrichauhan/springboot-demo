package com.eazybytes.demo;

import com.eazybytes.demo.beans.Vehicle;
import com.eazybytes.demo.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoMainClass {

    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
        vehicle.setName("audi");
        System.out.println("vehicle name from non-spring context is:" + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean(Vehicle.class);
        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is:" + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("integer value from spring context is:" + num);
        String hello1 = (String) context.getBean("hello");
        System.out.println("String value  from Spring Context is: " + hello1);
    }
}
