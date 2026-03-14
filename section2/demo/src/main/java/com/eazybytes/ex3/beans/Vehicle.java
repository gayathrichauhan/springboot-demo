package com.eazybytes.ex3.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean, DisposableBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayhello(){
        System.out.println("Printing hello from component vehicle bean");
    }
    //@PostConstruct
    //public void initialize(){
    //    this.name="audi";
    //}

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name="porsche";
    }
    @PreDestroy
    public void destroy(){
       System.out.println("destroying vehicle bean");
    }
}