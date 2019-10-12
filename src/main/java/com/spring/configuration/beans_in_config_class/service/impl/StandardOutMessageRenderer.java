package com.spring.configuration.beans_in_config_class.service.impl;

import com.spring.configuration.beans_in_config_class.service.MessageProvider;
import com.spring.configuration.beans_in_config_class.service.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider; //HelloWorldMessageProvider

    public void setSimpleString(String simpleString) {
        this.simpleString = simpleString;
    }

    private String simpleString;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }



    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}