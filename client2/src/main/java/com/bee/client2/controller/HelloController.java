package com.bee.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name) {
        System.out.println("名字：" + name + "__PORT:" + port);
        return "名字：" + name + "__PORT:" + port;
    }
}
