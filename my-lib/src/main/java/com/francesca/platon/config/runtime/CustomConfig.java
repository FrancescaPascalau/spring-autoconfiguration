package com.francesca.platon.config.runtime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean("runtimeMessage")
    public void runtimeMessage() {
        System.out.println("Runtime message");
    }
}
