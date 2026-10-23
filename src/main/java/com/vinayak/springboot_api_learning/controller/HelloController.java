package com.vinayak.springboot_api_learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello(
            @RequestParam(defaultValue = "Developer") String name) {
        return Map.of(
            "message", "Hello, " + name + "!",
            "application", "Spring Boot API"
        );
    }
}