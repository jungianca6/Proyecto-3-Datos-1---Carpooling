package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HolaMundo {
    @RequestMapping("/")
    public String hello() {
        return "project test";
    }
}
