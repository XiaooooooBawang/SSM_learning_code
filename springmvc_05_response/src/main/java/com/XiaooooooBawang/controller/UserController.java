package com.XiaooooooBawang.controller;

import com.XiaooooooBawang.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    /*@ResponseBody：设置当前控制器返回值作为响应体，该注解可以写在类上或者方法上，写在类上就是该类下的所有方法都有@ReponseBody功能*/
    /*当方法上有@ReponseBody注解后
     * 方法的返回值为字符串，会将其作为文本内容直接响应给前端
     * 方法的返回值为对象，会将对象转换成JSON响应给前端*/

    //响应页面/跳转页面
    //返回值为String类型，设置返回值为页面名称，即可实现页面跳转
    @RequestMapping("/toJumpPage")    //不需要写@ResponseBody，也就是不加任何注解，默认返回的东西就是一个页面
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";   //直接返回指定页面
    }

    //响应文本数据
    //返回值为String类型，设置返回值为任意字符串信息，即可实现返回指定字符串信息，需要依赖@ResponseBody注解
    @RequestMapping("/toText")
    @ResponseBody    //这个需要@ResponseBody，不然会当成返回名字叫response text的页面
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //响应POJO对象
    //返回值为实体类对象，设置返回值为实体类类型，即可实现返回对应对象的json数据，需要依赖@ResponseBody注解和@EnableWebMvc注解
    @RequestMapping("/toJsonPOJO")
    @ResponseBody   //要有这个
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("halo");
        user.setAge(15);
        return user;
    }

    //响应POJO集合对象
    //返回值为集合对象，设置返回值为集合类型，即可实现返回对应集合的json数组数据，需要依赖@ResponseBody注解和@EnableWebMvc注解
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("吼吼");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("哈哈");
        user2.setAge(12);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}