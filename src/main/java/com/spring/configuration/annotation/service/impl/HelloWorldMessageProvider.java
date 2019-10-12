package com.spring.configuration.annotation.service.impl;

import com.spring.configuration.annotation.service.MessageProvider;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World Mihai!";
    }
}
