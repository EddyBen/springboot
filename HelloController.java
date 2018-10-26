package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "First SpringBoot44dffd4gggg" +
                "";
    }
    @RequestMapping("/bye")
    public String bye(){
        return "First SpringBoot444";
    }


}
