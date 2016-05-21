package com.ge.lcprp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 5/21/2016.
 */
@Component
@Profile("english")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello world";
    }
}
