package com.example.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDockerDemoApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Das ist mein Springboot App in Docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerDemoApplication.class, args);
    }

}
