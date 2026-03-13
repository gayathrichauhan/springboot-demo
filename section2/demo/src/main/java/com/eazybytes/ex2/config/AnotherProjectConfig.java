package com.eazybytes.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnotherProjectConfig.class})
public class AnotherProjectConfig {

    @Bean
    String helloworld(){
        return "hello world";
    }
    @Bean
    Integer luckynumber(){
        return 18;
    }

}
