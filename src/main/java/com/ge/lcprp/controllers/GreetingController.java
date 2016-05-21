package com.ge.lcprp.controllers;

import com.ge.lcprp.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Mark on 5/21/2016.
 */
@Controller
public class GreetingController {


    private HelloWorldService helloWorldService;
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        System.out.println(helloWorldService.getGreeting());
        return helloWorldService.getGreeting();
    }
}
