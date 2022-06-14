package com.francesca.platon.app.controller;

import com.francesca.platon.config.runtime.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuntimeBeanController {

    @Autowired(required = false)
    @Qualifier("runtimeMessage")
    private final CustomConfig customConfig;

    public RuntimeBeanController(CustomConfig customConfig) {
        this.customConfig = customConfig;
    }

    @GetMapping("/runtime")
    public ResponseEntity<?> getRuntimeMessage() {
        return ResponseEntity.ok(customConfig != null ? customConfig.runtimeMessage() : "No runtime bean");
    }
}
