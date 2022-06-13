package com.francesca.platon.config.manual;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean("manualMessage")
    public void manualMessage() {
        System.out.println("Manual message");
    }
}
