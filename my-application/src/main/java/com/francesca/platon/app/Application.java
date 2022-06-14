package com.francesca.platon.app;

import com.francesca.platon.config.annotation.EnableCustomConfig;
import com.francesca.platon.config.manual.CustomConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@EnableCustomConfig
@SpringBootApplication
@Import(CustomConfig.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
