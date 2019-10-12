package com.spring.bean_declaration.collection_injection.set;

import java.util.Set;

public class CollectionsBean {

    private Set<String> nameSet;

    public CollectionsBean(Set<String> strings) {
        this.nameSet = strings;
    }

    public void printNameSet() {
        System.out.println(nameSet);
    }
}
