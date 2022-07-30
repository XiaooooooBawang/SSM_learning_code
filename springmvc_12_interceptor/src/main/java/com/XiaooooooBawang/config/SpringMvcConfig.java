package com.XiaooooooBawang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.XiaooooooBawang.controller", "com.XiaooooooBawang.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
