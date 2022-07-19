package com.example.springboot01.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class SendDev implements Send{
    @Override
    public String send() {
        return "开发环境send";
    }
}
