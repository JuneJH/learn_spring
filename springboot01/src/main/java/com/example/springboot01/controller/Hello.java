package com.example.springboot01.controller;

import com.example.springboot01.bean.Own;
import com.example.springboot01.service.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private Own own;

    @Autowired
    private Send send;

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String say(){
        return  ""+send.send()+port + own.name + own.age;
    }
}
