package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
    @RequestMapping("/")
    public String welcome(){
        return ("Welcome, SpringBoot on firstBootOnDocker");
    }


    @RequestMapping("hello")
    public String hello(){
        return ("Hello, SpringBoot on firstBootOnDocker");
    }
    
    @RequestMapping("sayHello")
    public String sayHello(){
        return ("Hello, SpringBoot on firstBootOnDocker for titi2244");
    }
}