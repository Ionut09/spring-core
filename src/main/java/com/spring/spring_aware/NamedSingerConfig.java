package com.spring.spring_aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NamedSingerConfig {

    @Bean(name = "johnMayer")
    public NamedSinger namedSinger() {
        return new NamedSinger();
    }
}
