package com.francesca.platon.config.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean("annotationMessage")
    public void annotationMessage() {
        System.out.println("Annotation message");
    }
}
