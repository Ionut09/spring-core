package com.spring.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("labels");
        messageSource.setFallbackToSystemLocale(true);
        return messageSource;
    }

    @Bean
    public List<String> labels() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("buttons");
        arrayList.add("labels");
        return arrayList;
    }
}
