package org.shareStories.Application;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.shareStories"})
public class Application {    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);            
    }

}
