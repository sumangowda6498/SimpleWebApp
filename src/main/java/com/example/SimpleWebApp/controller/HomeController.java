package com.example.SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
   // @ResponseBody
    public String greet(){
        System.out.println("CALLING");
        return "Welcome to Simple WebApp";

    }

    @RequestMapping("/about")
    // @ResponseBody
    public String about(){
        System.out.println("CALLING");
        return "This About Page";

    }
}
