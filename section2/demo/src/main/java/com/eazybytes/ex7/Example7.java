package com.eazybytes.ex7;

import com.eazybytes.ex7.beans.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eazybytes.ex7.config.ProjectScopeConfig;

public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectScopeConfig.class);
        var myservice1=context.getBean(MyService.class);
        var myservice2=context.getBean(MyService.class);
        System.out.println(myservice1.hashCode());
        System.out.println(myservice2.hashCode());
    }
}