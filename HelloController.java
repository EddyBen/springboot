package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "First SpringBoot1111";
    }
    @RequestMapping("/bye")
    public String bye(){
        return "First SpringBoot22222";
    }


}
