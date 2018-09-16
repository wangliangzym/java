package com.zym.annotation.controller;

import com.zym.annotation.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    public void add(){
        System.out.println("controller...");
        myService.add();
    }
}
