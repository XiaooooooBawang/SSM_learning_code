package com.xiaoooooobawang.springboot_10_log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Slf4j   //要导入lombok的依赖
public class BookController {
    //private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id:  " + id);

//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");

        //不想每次都在类的前面写private static final Logger logger。。。。的话可以在类前面加@Slf4j注解，可直接使用log对象
        log.debug("debug");  //默认是可以看到info以上级别的日志，想要看到debug级别就要开启debug模式
        log.info("info");
        log.warn("warn");
        log.error("error");

        /*日志的级别分为6种，分别是：
        - TRACE：运行堆栈信息，使用率低
        - DEBUG：程序员调试代码使用
        - INFO：记录运维过程数据
        - WARN：记录运维过程报警数据
        - ERROR：记录错误堆栈信息
        - FATAL：灾难信息，合并计入ERROR
        一般情况下，开发时候使用DEBUG，上线后使用INFO，运维信息记录使用WARN即可。*/

        return "hello springboot";
    }
}
