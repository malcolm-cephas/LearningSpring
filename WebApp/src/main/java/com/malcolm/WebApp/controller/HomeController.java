package com.malcolm.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HomeController 
{
    @RequestMapping("/")
    public String greet()
    {
        return "Testing Spring Webpage";
    }
    
    @RequestMapping("/about")
    public String about()
    {
        return "Hello Testing about page";
    }
}
