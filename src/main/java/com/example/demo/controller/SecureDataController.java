package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@RequestMapping("/api/v1/secure")
public class SecureDataController {

    @GetMapping
    public ResponseEntity<String> getSecureData(Principal principal) {
        return ResponseEntity.ok("Hello " + principal.getName() + "! You have successfully accessed a secure endpoint protected by our JWT Security Filter.");
    }
}
