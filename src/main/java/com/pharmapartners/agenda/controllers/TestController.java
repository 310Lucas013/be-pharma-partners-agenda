package com.pharmapartners.agenda.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String greeting() {
        return "Hello world";
    }
}
