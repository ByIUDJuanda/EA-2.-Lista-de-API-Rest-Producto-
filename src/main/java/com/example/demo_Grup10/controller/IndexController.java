package com.example.demo_Grup10.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController{

    @GetMapping("/")
    public String index(){
        return "home2";
    }

    @GetMapping("/index")
    public String index2(){
        return "home";
    }
}