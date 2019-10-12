package com.spring.bean_scopes.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("singletonComponent")
@Data
public class SingletonBean {

    @Value("John singleton")
    private String name;
}
