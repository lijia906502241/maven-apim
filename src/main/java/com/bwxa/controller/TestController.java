package com.bwxa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping(value = "test")
    public String test(){
        System.out.println("测试");
        System.out.println("-----------");
        return "login";
    }
}
