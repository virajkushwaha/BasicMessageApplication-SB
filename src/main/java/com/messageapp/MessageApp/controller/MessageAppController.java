package com.messageapp.MessageApp.controller;

import org.springframework.web.bind.annotation.*;
import com.messageapp.MessageApp.dto.UserDTO;

@RestController
@RequestMapping("/hello") // Base URL for all endpoints
public class MessageAppController {

    // UC 1: Basic GET Request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC 2: GET Request with Query Parameter
    @GetMapping("/query")
    public String helloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC 3: GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC 4: POST Request with JSON Body
    @PostMapping("/post")
    public String printingJsonData(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // UC 5: PUT Request with Mixed Parameters
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
