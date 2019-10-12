package com.spring.bean_declaration.collection_injection.references;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Config {
    @Bean
    public CollectionRefBean collectionRefBean() {
        return new CollectionRefBean();
    }

    @Bean
    @Order(1)
    @Qualifier("onlyThis")
    public SampleBean getElement() {
        return new SampleBean("John");
    }

    @Bean
    @Order(2)
    public SampleBean getAnotherElement() {
        return new SampleBean("Adam");
    }

    @Bean
    @Order(3)
    public SampleBean getOneMoreElement() {
        return new SampleBean("Harry");
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
        CollectionRefBean bean = applicationContext.getBean(CollectionRefBean.class);
        bean.printBeanList();
    }
}