package com.spring.bean_scopes.singleton;


import com.spring.bean_scopes.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSingleton {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonBean bean1 = ctx.getBean("singletonComponent", SingletonBean.class);
        SingletonBean bean2 = ctx.getBean("singletonComponent", SingletonBean.class);

        System.out.println("The 2 beans are the same instance: " + (bean1 == bean2));
        System.out.println(bean1 + "  " + bean1.hashCode());
        System.out.println(bean2 + "  " + bean2.hashCode());
    }
}
