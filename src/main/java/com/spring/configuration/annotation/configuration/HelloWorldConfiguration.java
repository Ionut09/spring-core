package com.spring.configuration.annotation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.spring.configuration.annotation"})
@ImportResource({"classpath*:applicationContext.xml"})
public class HelloWorldConfiguration {}