package com.xiaoooooobawang.mybatisplus_02_dql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoooooobawang.mybatisplus_02_dql.mapper")
public class MybatisPlus02DqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus02DqlApplication.class, args);
    }

}
