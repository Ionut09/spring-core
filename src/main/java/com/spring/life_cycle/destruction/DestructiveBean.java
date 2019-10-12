package com.spring.life_cycle.destruction;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

public class DestructiveBean implements InitializingBean {
    private File file;
    private String filePath;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing  Bean");

        if (filePath == null) {
            throw new IllegalArgumentException(
                    "You must specify the filePath property of"
                            + DestructiveBean.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists after init: " + file.exists());
    }

    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:life-cycle/destruction/app-context-destroy-method.xml");
        ctx.refresh();
        DestructiveBean bean = (DestructiveBean) ctx.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        ctx.destroy();
        System.out.println("Called destroy()");
    }

    public void destroy() {
        System.out.println("Destroying  Bean");
        if (!file.delete()) {
            System.err.println("ERROR: failed  to delete file.");
        }
        System.out.println("File exists after destroy: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}