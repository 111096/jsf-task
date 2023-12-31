package com.jsftask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.*;


@SpringBootApplication
public class JsfTask extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JsfTask.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JsfTask.class, args);
    }

}
