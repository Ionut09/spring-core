package com.spring.bean_declaration.collection_injection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionBean getCollectionsBean() {
        return new CollectionBean();
    }

    @Bean
    public List<String> nameList() {
        return Arrays.asList("John", "Adam", "Harry");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionBean collectionsBean = context.getBean(CollectionBean.class);
        collectionsBean.printNameList();
    }
}