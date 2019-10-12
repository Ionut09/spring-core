package com.spring.bean_scopes.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("prototypeComponent")
@Scope(scopeName = "prototype")
@ToString
public class PrototypeBean {

    @Value("John prototype")
    private String name;
}