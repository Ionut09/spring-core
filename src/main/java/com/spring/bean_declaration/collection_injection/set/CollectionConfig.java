package com.spring.bean_declaration.collection_injection.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionsBean getCollectionsBean() {
        return new CollectionsBean(stringsSet());
    }

    @Bean
    public Set<String> stringsSet() {
        Set<String> strings = new HashSet<>();
        strings.add("John");
        strings.add("Adam");
        strings.add("Harry");
        return strings;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBean collectionsBean = ctx.getBean(CollectionsBean.class);
        collectionsBean.printNameSet();
    }
}