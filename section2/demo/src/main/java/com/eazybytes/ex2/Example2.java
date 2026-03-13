package com.eazybytes.ex2;

import com.eazybytes.ex2.beans.Vehicle;

import com.eazybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2{

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);//this is used for starting the spring container

        var veh = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        var vehicle = (Vehicle) context.getBean("ferrariVehicle");
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

        var vhcle=context.getBean(Vehicle.class);
        System.out.print("Vehicle name from spring context is:"+vhcle.getName());

        var helloworld=context.getBean(String.class);
            System.out.println("\nString value from spring context is:"+helloworld);
        }
    }
