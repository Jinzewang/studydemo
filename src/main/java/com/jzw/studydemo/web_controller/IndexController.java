package com.jzw.studydemo.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("加了一点东西");
        return "index";
    }
}
