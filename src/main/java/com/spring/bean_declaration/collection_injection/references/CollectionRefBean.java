package com.spring.bean_declaration.collection_injection.references;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class CollectionRefBean {

    @Autowired(required = false)
    @Qualifier("onlyThis")
    private List<SampleBean> beanList;

    public void printBeanList() {
        System.out.println(beanList);
    }
}