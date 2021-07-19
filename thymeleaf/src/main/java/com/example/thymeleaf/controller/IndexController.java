package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Fan
 */
@Controller
public class IndexController {
    @GetMapping("home")
    public String index() {
        return "index";
    }
}
