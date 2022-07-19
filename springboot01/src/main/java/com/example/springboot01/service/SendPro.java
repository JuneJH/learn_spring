package com.example.springboot01.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class SendPro implements Send{
    @Override
    public String send() {
        return "生产环境send";
    }
}
