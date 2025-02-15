package com.example.controller;

import com.example.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    private WelcomeFeignClient welcomeFeignClient;

    @GetMapping("/greet")
    public String getGreetMsg(){

        //System.out.println("Inside getGreetMsg()");
        String welcomeMsg = "";
        welcomeMsg = welcomeFeignClient.getWelcomeMsg();
        //System.out.println(welcomeMsg);

        return "Good morning"+ " "+welcomeMsg;
    }
}