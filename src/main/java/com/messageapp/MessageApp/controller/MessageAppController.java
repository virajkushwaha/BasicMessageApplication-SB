package com.messageapp.MessageApp.controller;

import org.springframework.web.bind.annotation.*;

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
    // UC 3: GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

