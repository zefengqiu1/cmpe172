package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
@PropertySource("./dev.properties")
public class BackendApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
