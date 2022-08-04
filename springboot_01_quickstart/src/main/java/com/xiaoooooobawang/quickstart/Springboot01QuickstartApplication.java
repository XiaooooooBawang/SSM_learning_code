package com.xiaoooooobawang.quickstart;

import com.xiaoooooobawang.quickstart.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot01QuickstartApplication {
    //当前运行的这个类在SpringBoot程序中是所有功能的入口，称为<font color="#ff0000"><b>引导类</b></font>。
    public static void main(String[] args) {
        //SpringBoot程序启动还是创建了一个Spring容器对象，我们是可以获取bean的
        ConfigurableApplicationContext context = SpringApplication.run(Springboot01QuickstartApplication.class, args);
        BookController bookController = context.getBean(BookController.class);
        System.out.println(bookController);
    }

}
