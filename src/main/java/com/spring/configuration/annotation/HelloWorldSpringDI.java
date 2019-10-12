package com.spring.configuration.annotation;

import com.spring.configuration.annotation.configuration.HelloWorldConfiguration;
import com.spring.configuration.annotation.service.MessageRenderer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String... args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
