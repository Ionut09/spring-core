package com.spring.configuration.beans_in_config_class.service.impl;

import com.spring.configuration.beans_in_config_class.service.MessageProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configurable-provider")
public class ConfigurableMessageProviderWithConstructorInjection implements MessageProvider {
    private String message;

    @Autowired
    public ConfigurableMessageProviderWithConstructorInjection(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
