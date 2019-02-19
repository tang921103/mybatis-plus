package com.zsm.generate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world";
    }
}
