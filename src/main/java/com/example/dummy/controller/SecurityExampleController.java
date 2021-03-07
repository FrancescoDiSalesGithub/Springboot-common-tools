package com.example.dummy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityExampleController
{

    @GetMapping("/")
    public String home()
    {
        return "welcome to home";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "admin page";
    }

    @GetMapping("/user")
    public String user()
    {
        return "user page";
    }




}
