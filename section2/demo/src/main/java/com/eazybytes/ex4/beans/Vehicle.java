package com.eazybytes.ex4.beans;


import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle bean created");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

}