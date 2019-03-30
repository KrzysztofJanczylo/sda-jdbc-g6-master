package com.justpz.sda.hiernateg6.mongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMongoApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringMongoApp.class, args);


    }


}
