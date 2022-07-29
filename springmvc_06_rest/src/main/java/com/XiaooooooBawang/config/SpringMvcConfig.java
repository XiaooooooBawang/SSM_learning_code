package com.XiaooooooBawang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.XiaooooooBawang.controller")
@EnableWebMvc  //开启SpringMVC的注解支持，这里面就包含了将JSON转换成对象的功能
public class SpringMvcConfig {
}
