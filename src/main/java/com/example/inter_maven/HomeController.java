package com.example.inter_maven;

import org.springframework.web.bind.annotation.*;
@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello, World! hi There";
    }
}