package com.example.springbootlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelleController {
    @GetMapping("/hello")
    public String hello(){

        return "hello Spring Boot";
    }
}
