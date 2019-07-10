package com.oaec.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/test1")
    public String test1(Model model){
        String content = "import org.springframework.web.bind.annotation.RequestMapping;";
        model.addAttribute("content",content);
        return "hello";
    }
}
