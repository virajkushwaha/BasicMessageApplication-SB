package com.messageapp.MessageApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageAppController {
    //UC1
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello From BridgeLabz";
    }
    //UC2
    @GetMapping("/query")
    public String helloWithQuery(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }
}

