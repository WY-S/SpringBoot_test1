package com.sunwenyi.mydevops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @RequestMapping("/hello")
    public String test(){
        return "Hello Jenkins!! --v1.1";
    }

}
