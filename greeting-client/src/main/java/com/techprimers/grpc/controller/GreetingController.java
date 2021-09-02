package com.techprimers.grpc.controller;

import com.techprimers.grpc.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String getGreetingMessage(@RequestParam(value = "message",
            defaultValue = "Hello") String message) {
        return greetingService.receiveGreeting(message);
    }
}