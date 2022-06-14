package com.francesca.platon.config.manual;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean("manualMessage")
    public String manualMessage() {
        return "Manual message from bean";
    }
}
