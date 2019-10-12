package com.spring.life_cycle.destruction;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DestructiveBeanWithJSR250 {
    private File file;
    private String filePath;

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing  Bean");
        if (filePath == null) {
            String message = "You must specify the filePath property of " + getClass();
            throw new IllegalArgumentException(message);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying  Bean");
        if (!file.delete()) {
            System.err.println("ERROR: failed  to delete file.");
        }
    }

    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:life-cycle/destruction/app-context-pre-destroy.xml");
        ctx.refresh();
        DestructiveBeanWithJSR250 bean =
                (DestructiveBeanWithJSR250) ctx.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        ctx.destroy();
        System.out.println("Called destroy()");
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}