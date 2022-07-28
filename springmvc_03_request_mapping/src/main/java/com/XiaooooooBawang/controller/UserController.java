package com.XiaooooooBawang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")  //在整个类前面加上请求路径前缀
public class UserController {

    //@RequestMapping("/user/save")
    @RequestMapping("/save")  //请求路径后缀
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }

    //@RequestMapping("/user/delete")
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }
}
