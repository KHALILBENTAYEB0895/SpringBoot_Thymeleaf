package com.sbk.thymleaf_formation.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {
    //handler method to handle helloWorld request
    @GetMapping("/hello-world")
    public String helloWrld(Model model){
        model.addAttribute("message","Hello World!");
        return "hello-world";
    }
}
