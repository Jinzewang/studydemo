package com.jzw.studydemo.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courseorder")
public class CourseOrder {
    @RequestMapping("/list")
    public String list() {
        return "courseorder/list";
    }
}
