package com.codegym.blog_jpa.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
