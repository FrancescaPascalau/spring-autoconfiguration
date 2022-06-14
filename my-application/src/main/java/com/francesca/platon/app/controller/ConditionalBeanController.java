package com.francesca.platon.app.controller;

import com.francesca.platon.config.conditional.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalBeanController {

    @Autowired(required = false)
    @Qualifier("conditionalMessage")
    private final CustomConfig customConfig;

    public ConditionalBeanController(CustomConfig customConfig) {
        this.customConfig = customConfig;
    }

    @GetMapping("/conditional")
    public ResponseEntity<?> getConditionalMessage() {
        return ResponseEntity.ok(customConfig != null ? customConfig.conditionalMessage() : "No conditional bean");
    }
}
