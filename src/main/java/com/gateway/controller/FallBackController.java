package com.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("FallBackController")
public class FallBackController {

    @RequestMapping("/fallback")
    public ResponseEntity<String> fallback() {
        return new ResponseEntity<>("Service is temporarily unavailable. Please try again later.", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
