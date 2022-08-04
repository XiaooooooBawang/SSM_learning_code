package com.xiaoooooobawang.springboot_11_hot_deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id:  " + id);
        System.out.println("这里变化了，看看热部署效果，要想实现热部署需要在pom中导入springboot的开发工具的依赖，每次程序变化之后点击'构建'就行，不再需要整个服务器重启");
        return "hello springboot";
    }
}
