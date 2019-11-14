package com.bee.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
