package com.xiaoooooobawang.mybatisplus_03_dml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoooooobawang.mybatisplus_03_dml.mapper")
public class MybatisPlus03DmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus03DmlApplication.class, args);
    }

}
