package com.spring.configuration.xml;

import com.spring.configuration.beans_in_config_class.service.MessageProvider;
import com.spring.configuration.beans_in_config_class.service.MessageRenderer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        MessageProvider bean = ctx.getBean("configurable-provider", MessageProvider.class);
        mr.render();
        System.out.println(bean.getMessage());
    }
}
