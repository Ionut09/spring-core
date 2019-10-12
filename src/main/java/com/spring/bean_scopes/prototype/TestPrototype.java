package com.spring.bean_scopes.prototype;


import com.spring.bean_scopes.AppConfig;
import com.spring.bean_scopes.prototype.PrototypeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPrototype {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PrototypeBean bean1 = ctx.getBean("prototypeComponent", PrototypeBean.class);
        PrototypeBean bean2 = ctx.getBean("prototypeComponent", PrototypeBean.class);

        System.out.println("The 2 beans are the same instance: " + (bean1 == bean2));
        System.out.println(bean1 + "  " + bean1.hashCode());
        System.out.println(bean2 + "  " + bean2.hashCode());
    }
}
