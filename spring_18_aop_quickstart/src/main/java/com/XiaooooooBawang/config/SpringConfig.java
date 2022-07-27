package com.XiaooooooBawang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.XiaooooooBawang")
//开启注解开发AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {
}
