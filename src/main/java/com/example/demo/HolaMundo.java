package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Hola{
    @RequestMapping("/")
    public String hello() {
        return "project test";
    }
}


