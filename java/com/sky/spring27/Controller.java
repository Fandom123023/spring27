package com.sky.spring27;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/calculator")
    public String hollo(){
        return ("добро пожаловать в колькулятор");



    }

}
