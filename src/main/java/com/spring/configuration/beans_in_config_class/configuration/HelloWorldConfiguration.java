package com.spring.configuration.beans_in_config_class.configuration;

import com.spring.configuration.beans_in_config_class.service.MessageProvider;
import com.spring.configuration.beans_in_config_class.service.MessageRenderer;
import com.spring.configuration.beans_in_config_class.service.impl.HelloWorldMessageProvider;
import com.spring.configuration.beans_in_config_class.service.impl.StandardOutMessageRenderer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = {"com.spring.configuration.beans_in_config_class"})
@Configuration
public class HelloWorldConfiguration {

    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    //    <bean id="simpleStringBean" class="java.lang.String"/>
    @Bean
    @Qualifier("stringulet")
    @Scope("singleton")
    public String simpleStringBean() {
        return "simpleStringBeanValue";
    }


    // equivalent to  <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

    @Bean
    public String message() {

        return "I hope that someone gets my message in a bottle";
    }
}
