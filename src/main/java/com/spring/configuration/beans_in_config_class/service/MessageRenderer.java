package com.spring.configuration.beans_in_config_class.service;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    void setSimpleString(String simpleString);

    MessageProvider getMessageProvider();
}