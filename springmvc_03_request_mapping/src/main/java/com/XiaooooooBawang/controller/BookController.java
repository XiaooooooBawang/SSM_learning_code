package com.XiaooooooBawang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")  //在整个类前面加上请求路径前缀
public class BookController {
    //@RequestMapping("/book/save")
    @RequestMapping("/save")   //只需要写后缀
    @ResponseBody
    public String save(){
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }
}
