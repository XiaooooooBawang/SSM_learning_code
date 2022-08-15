package com.xiaoooooobawang.mybatisplus_01_quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoooooobawang.mybatisplus_01_quickstart.mapper")
public class MybatisPlus01QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus01QuickstartApplication.class, args);
    }

}
