package com.dhia.microservice2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/microservice2")
@RequiredArgsConstructor
public class controller {

    @GetMapping
    public ResponseEntity<String> méthode() {
        return ResponseEntity.ok("microservice2");
    }
}
