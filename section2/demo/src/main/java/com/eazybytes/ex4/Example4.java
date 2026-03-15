package com.eazybytes.ex4;

import com.eazybytes.ex4.beans.Person;
import com.eazybytes.ex4.beans.Vehicle;
import com.eazybytes.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);//this is used for starting the spring container

        var person=context.getBean(Person.class);
        var vehicle=context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is:"+person.getName());
        System.out.println("Vehicle name from Spring Context is:"+vehicle.getName());
        System.out.println("Vehicle that person owns is:"+person.getVehicle());

        }
    }
