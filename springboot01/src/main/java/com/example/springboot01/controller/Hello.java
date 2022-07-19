package com.example.springboot01.controller;

import com.example.springboot01.service.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    private Send send;

    @GetMapping("/hello")
    public String say(){
        return  send.send();
    }
}
