package com.justpz.sda.hiernateg6.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringApp.class, args);


        ToyService toyService = context.getBean(ToyService.class);
        toyService.saveTestData();
        toyService.saveTestData2();
        toyService.saveTestData();
        toyService.saveTestData2();
        toyService.saveTestData();
        toyService.saveTestData2();
        toyService.pritAll();
        toyService.pritAll2();


        System.out.println(toyService.toString());

    }
}
