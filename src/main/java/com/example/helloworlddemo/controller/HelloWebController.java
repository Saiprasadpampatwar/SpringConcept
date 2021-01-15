package com.example.helloworlddemo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello (){
        return "hello";
    }

    @GetMapping("/web/message")
    public String massage(Model model){
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
