package com.spring.configuration.beans_in_config_class.service.impl;

import com.spring.configuration.beans_in_config_class.service.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World!";
    }
}
