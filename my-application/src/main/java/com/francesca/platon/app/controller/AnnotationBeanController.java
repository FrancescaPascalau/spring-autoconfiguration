package com.francesca.platon.app.controller;

import com.francesca.platon.config.annotation.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationBeanController {

    @Autowired(required = false)
    @Qualifier("annotationMessage")
    private final CustomConfig customConfig;

    public AnnotationBeanController(CustomConfig customConfig) {
        this.customConfig = customConfig;
    }

    @GetMapping("/annotation")
    public ResponseEntity<?> getAnnotationMessage() {
        return ResponseEntity.ok(customConfig != null ? customConfig.annotationMessage() : "No annotation bean");
    }
}
