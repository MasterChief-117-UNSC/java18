package com.turling.springboot02.springboot02.controller;

import com.turling.springboot02.springboot02.entity.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MyController {
    @Value("${app.name}")
    private String name;

    @Value("${app.id}")
    private Integer id;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("hello")
    public String hello(){
        return "index";
    }
    @GetMapping("birth")
    @ResponseBody
    public Date birth(Date d){
        return d;
    }
}
