package com.eazybytes.ex3;

import com.eazybytes.ex3.beans.Vehicle;
import com.eazybytes.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);//this is used for starting the spring container

        var veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle name for Spring Context is:"+veh.getName());
        veh.sayhello();
        context.close();
        }
    }
