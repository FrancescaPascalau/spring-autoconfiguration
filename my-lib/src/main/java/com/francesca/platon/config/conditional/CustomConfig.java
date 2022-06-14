package com.francesca.platon.config.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@ConditionalOnMissingBean(type = "com.francesca.platon.config.MyBean")
public class CustomConfig {

    @Bean("conditionalMessage")
    public String conditionalMessage() {
        return "Conditional message from bean";
    }
}
