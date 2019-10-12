package com.spring.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceDemo {

    private MessageSource messageSource;

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public static void main(String... args) throws InterruptedException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageSourceConfig.class);

        Locale english = Locale.ENGLISH;
        Locale german = new Locale("de", "DE");

        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, german));
        System.out.println(ctx.getMessage("nameMsg", new Object[]{"John", "Mayer"}, english));
        System.out.println(ctx.getMessage("nameMsg", new Object[]{"John", "Mayer"}, german));

        MessageSourceDemo messageSourceDemo = ctx.getBean(MessageSourceDemo.class);
        System.out.println(messageSourceDemo.messageSource.getMessage("msg", null, english));
        System.out.println(messageSourceDemo.messageSource.getMessage("msg", null, german));
        Thread.sleep(4000);
    }
}