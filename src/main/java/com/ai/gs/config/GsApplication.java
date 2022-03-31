package com.ai.gs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ai")
@SpringBootApplication
public class GsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsApplication.class,args);
        System.out.println("hello git");
        System.out.println("two git");
        System.out.println("conflict git");
        System.out.println("push test");
        System.out.println("pu test");
    }

}
