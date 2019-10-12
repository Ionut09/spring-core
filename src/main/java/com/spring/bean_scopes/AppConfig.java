package com.spring.bean_scopes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.bean_scopes"})
public class AppConfig {
}