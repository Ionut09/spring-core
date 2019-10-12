package com.spring.bean_declaration.collection_injection.map;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class CollectionsBean {

    private Map<Integer, String> nameMap;

    @Autowired
    public void setNameMap(Map<Integer, String> nameMap) {
        this.nameMap = nameMap;
    }

    public void printNameMap() {
        System.out.println(nameMap);
    }
}
