package com.XiaooooooBawang.controller;

import com.XiaooooooBawang.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




//1.将ResponseBody提到类上面，让所有的方法都有@ResponseBody的功能
//2.使用@RestController注解替换@Controller与@ResponseBody注解，简化书写
//@Controller
//@ResponseBody

@RestController  //@Controller + ReponseBody

@RequestMapping("/books")  //访问路径前缀
public class BookController {

    //@RequestMapping(method = RequestMethod.POST) //每个方法的@RequestMapping注解中都要使用method属性定义请求方式，重复性太高。
    //@ResponseBody
    @PostMapping    //使用@GetMapping  @PostMapping  @PutMapping  @DeleteMapping代替
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    //@ResponseBody
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    //@ResponseBody
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    //@RequestMapping(method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }

}