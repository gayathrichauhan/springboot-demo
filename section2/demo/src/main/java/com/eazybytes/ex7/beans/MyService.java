package com.eazybytes.ex7.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MyService {
    public MyService(){

        System.out.println("My Service Bean is created");
    }
}
