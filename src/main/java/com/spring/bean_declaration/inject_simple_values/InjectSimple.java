package com.spring.bean_declaration.inject_simple_values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class InjectSimple {
    @Value("Johnny")
    private String name;
    @Value("27")
    private int age;
    @Value("1.90")
    private float height;
    @Value("true")
    private boolean programmer;
    private Long ageInSeconds;

    @Bean
    public InjectSimple simple() {
        return new InjectSimple();
    }

    public static void main(String... args) {
//        GenericXmlApplicationContext ctx =
//                new GenericXmlApplicationContext();
//        ctx.load("classpath:app-context.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InjectSimple.class);
        InjectSimple simple = (InjectSimple) ctx.getBean("simple");
        System.out.println(simple);
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }
}