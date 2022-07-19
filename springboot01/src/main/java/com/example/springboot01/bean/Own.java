package com.example.springboot01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:own.properties")
@ConfigurationProperties("abc.own")
public class Own {
    public String name;
    public int age;
}
