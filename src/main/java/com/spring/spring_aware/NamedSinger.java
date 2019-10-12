package com.spring.spring_aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NamedSinger implements BeanNameAware {
    private String name;

    /**
     * va fi chemata de container
     */
    public void setBeanName(String beanName) {
        this.name = beanName;
    }

    public void sing() {
        System.out.println("Singer " + name + " - sing()");
    }

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(NamedSingerConfig.class);
        NamedSinger bean = (NamedSinger) ctx.getBean("johnMayer");
        bean.sing();
    }
}
