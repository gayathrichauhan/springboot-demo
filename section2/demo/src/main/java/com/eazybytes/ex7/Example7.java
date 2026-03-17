package com.eazybytes.ex7;

import com.eazybytes.ex7.beans.MyService;
import com.eazybytes.ex7.beans.UserSession;
import org.apache.catalina.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eazybytes.ex7.config.ProjectScopeConfig;

public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectScopeConfig.class);
        var user1=context.getBean(UserSession.class);
        var user2=context.getBean(UserSession.class);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.getSessionId());
        System.out.println(user2.getSessionId());

    }
}