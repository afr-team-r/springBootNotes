package com.rfa.todo.bin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value="com.rfa.todo")
@EnableAutoConfiguration
@Configuration
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
    
    // http://www.simpledev.com.br/spring-hibernate.html
    
}