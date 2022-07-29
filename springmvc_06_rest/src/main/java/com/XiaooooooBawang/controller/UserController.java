package com.XiaooooooBawang.controller;

import com.XiaooooooBawang.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    /*
    `@RequestBody`、`@RequestParam`、`@PathVariable`,这三个注解之间的区别和应用分别是什么?

        * 区别
          * @RequestParam用于接收url地址传参或表单传参
          * @RequestBody用于接收json数据
          * @PathVariable用于接收路径参数，使用{参数名称}描述路径参数
        * 应用
          * 后期开发中，发送请求参数超过1个时，以json格式为主，@RequestBody应用较广
          * 如果发送非json格式数据，选用@RequestParam接收请求参数
          * 采用RESTful进行开发，当参数数量较少时，例如1个，可以采用@PathVariable接收请求路径变量，通常用于传递id值
  */


    //@RequestMapping("/save")
    @RequestMapping(value = "/users",method = RequestMethod.POST) //设置当前请求方法为POST，表示REST风格中的添加操作
    @ResponseBody
    public String save(@RequestBody User user) {
        System.out.println("user save..."+user);
        return "{'module':'user save'}";
    }

    //@RequestMapping("/delete")
    //多个请求路径参数传递
    @RequestMapping(value = "/users/{id}/{name}", method = RequestMethod.DELETE)  //设置当前请求方法为DELETE，表示REST风格中的删除操作
    @ResponseBody
    public String delete(@PathVariable Integer id, @PathVariable String name) {
        //要添加路径变量注解@PathVariable，路径上的形参名和方法的形参要对应才能接收，若不对应，可@PathVariable("id") Integer userId
        System.out.println("user delete..." + id + name);
        return "{'module':'user delete'}";
    }

    //@RequestMapping("/update")
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    //@RequestMapping("/getById")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)  //设置当前请求方法为GET，表示REST风格中的查询操作
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    //@RequestMapping("/findAll")
    @RequestMapping(value = "/users" ,method = RequestMethod.GET)    //设置当前请求方法为GET，表示REST风格中的查询操作
    @ResponseBody
    public String getAll() {
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
}
