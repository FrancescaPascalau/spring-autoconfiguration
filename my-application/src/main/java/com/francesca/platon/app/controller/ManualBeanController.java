package com.francesca.platon.app.controller;

import com.francesca.platon.config.manual.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManualBeanController {

    @Autowired(required = false)
    @Qualifier("manualMessage")
    private final CustomConfig customConfig;

    public ManualBeanController(CustomConfig customConfig) {
        this.customConfig = customConfig;
    }

    @GetMapping("/manual")
    public ResponseEntity<?> getManualMessage() {
        return ResponseEntity.ok(customConfig != null ? customConfig.manualMessage() : "No manual bean");
    }
}
