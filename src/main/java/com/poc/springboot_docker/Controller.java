package com.poc.springboot_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public String get(){
        return "hello";
    }
    @GetMapping("/webhook")
    public String webhook(){
        return "webhook working";
    }

}
