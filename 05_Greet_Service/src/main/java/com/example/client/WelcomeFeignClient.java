package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="welcome-service")
public interface WelcomeFeignClient {

    @GetMapping("/welcome")
    public String getWelcomeMsg();

}