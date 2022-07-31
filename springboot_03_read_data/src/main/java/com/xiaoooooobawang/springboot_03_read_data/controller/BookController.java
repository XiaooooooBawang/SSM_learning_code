package com.xiaoooooobawang.springboot_03_read_data.controller;

import com.xiaoooooobawang.springboot_03_read_data.model.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    /*法一：使用 @Value注解注入application.yml中的某个属性值*/
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject0;

    /*法二：Environment对象封装application.yml中的所有属性*/
    @Autowired
    private Environment environment;

    /*法三：将配置文件中的数据封装到我们自定义的实体类对象中的方式*/
    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id:  " + id);
        System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject0);
        System.out.println("------------");
//        如果需要使用哪个数据只需要通过调用 `Environment` 对象的 `getProperty(String name)` 方法获取
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.subject[0]"));
        System.out.println("------------");
        System.out.println(enterprise);
        System.out.println(enterprise.getName());
        return "hello springboot";
    }
}
