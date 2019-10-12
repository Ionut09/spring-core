package com.spring.util;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;

public class BeanUtility {

    public static Object getBean(String beanName, ApplicationContext ctx) {
        try {
            Object bean = ctx.getBean(beanName);
            System.out.println("Bean-->" + beanName + ": " + bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: " + ex.getMessage());
            return null;
        }
    }
}
