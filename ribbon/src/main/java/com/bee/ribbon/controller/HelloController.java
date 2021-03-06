package com.bee.ribbon.controller;

import com.bee.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name") String name) {
        System.out.println("ribbon has running ");
        return helloService.hiService(name);
    }

}
