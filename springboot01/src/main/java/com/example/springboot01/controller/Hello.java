package com.example.springboot01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String say(){
        return  "Hello Spring Boot!!!";
    }
}
