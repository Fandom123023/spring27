package com.sky.spring27;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class Controller {
    private final CullkSevice   cullkSevice;
    public Controller( CullkSevice   cullkSevice){
        this.cullkSevice = cullkSevice;
    }
    @GetMapping
    public String hollo() {
        return ("добро пожаловать в колькулятор");
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = cullkSevice.plus(num1,num2);
        return num1 + " + " + num2 + " = " + result;



    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = cullkSevice.minus(num1,num2);
        return num1 + " - " + num2 + " = " + result;

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = cullkSevice.multiply(num1,num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0){
            return "Деление на 0 в Java запрещено!";
        }
        double result = cullkSevice.divide(num1,num2);
        return num1 + " / " + num2 + " = " + result;
    }




}



