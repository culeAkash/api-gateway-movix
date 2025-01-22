package com.moviex.api.gateway.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

//    @Value("${jwt.secret}")
//    private String secretKey;

    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("/")
    public ResponseEntity<Void> index() {
        System.out.println(message);
        return ResponseEntity.ok().build();
    }
}
