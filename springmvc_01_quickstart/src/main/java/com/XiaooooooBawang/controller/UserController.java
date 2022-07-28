package com.XiaooooooBawang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/save")  //设置当前操作的访问路径
    @ResponseBody   //设置当前操作的返回值类型，也就是把返回值设置为响应体
    public String save() {
        System.out.println("user save  ");
        return "{'module':'springmvc'}";
    }
}
