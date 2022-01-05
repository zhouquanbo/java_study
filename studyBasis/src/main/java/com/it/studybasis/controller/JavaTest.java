package com.it.studybasis.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTest {


    @GetMapping("/test")
    public String get(){
        System.out.println("iiiii");
        return "ok";
    }
}
