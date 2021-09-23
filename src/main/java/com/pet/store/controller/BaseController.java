package com.pet.store.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public String ping (){
        return "{\"message\":\"PONG!\"}";
    }
    @GetMapping
    public String root (){
        return "UP and Running";
    }

}
