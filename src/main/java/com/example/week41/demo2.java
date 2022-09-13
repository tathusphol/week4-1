package com.example.week41;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo2 {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String genname(@PathVariable("name") String name){
        return "Hi, " + name + "<br>" + "Your new password is " + (int)((Math.random() * 1000000000) % 1000000000);
    }
}
