package com.spring.configuration.beans_in_config_class;

import com.spring.configuration.beans_in_config_class.configuration.HelloWorldConfiguration;
import com.spring.configuration.beans_in_config_class.service.MessageProvider;
import com.spring.configuration.beans_in_config_class.service.MessageRenderer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String... args) {

        ApplicationContext ctx =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        ApplicationContext ctxXml =  new ClassPathXmlApplicationContext("classpath:app-context.xml");

        MessageRenderer mrByName = ctx.getBean("renderer", MessageRenderer.class); //numele beanului - renderer e acelasi cu numele metodei cu care a fost creat bean-ul
        MessageRenderer mrByType = ctx.getBean(MessageRenderer.class);
        //MessageProvider bean = ctx.getBean("configurable-provider", MessageProvider.class);
        mrByType.render();
        //System.out.println(bean.getMessage());
    }
}
