package com.eazybytes.ex2.config;

import com.eazybytes.ex2.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
 */
@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
   this method when it initializes its context and adds the returned
   value to the context.
     */
    @Bean(name="hondaVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }


    @Primary
    @Bean(value="audiVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrariVehicle")
    @Description("this is a vehicle class bean")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
    @Bean
    String hello() {
        return "Hello Spring!";
    }


}