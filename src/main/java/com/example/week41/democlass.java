package com.example.week41;

import org.springframework.web.bind.annotation.*;

@RestController
public class democlass {
    @RequestMapping(value = "/add/{number1}/{number2}", method = RequestMethod.GET)
    public String plus(@PathVariable("number1") double number1, @PathVariable("number2") double number2){
        return number1+number2+"";
    }

    @RequestMapping(value = "/minus/{number1}/{number2}", method = RequestMethod.GET)
    public String minus(@PathVariable("number1") double number1, @PathVariable("number2") double number2){
        return number1-number2+"";
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public String multiple(@RequestParam("num1") double number1, @RequestParam("num2") double number2){
        return number1*number2+"";
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") double number1, @RequestParam("num2") double number2){
        return number1/number2+"";
    }
}
