package com.XiaooooooBawang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//在配置类上添加`@Configuration`注解，将其标识为一个配置类,替换`applicationContext.xml`,设定当前类为Spring配置类
@ComponentScan("com.XiaooooooBawang")
//在配置类上添加包扫描注解`@ComponentScan`替换`<context:component-scan base-package=""/>`
public class SpringConfig {
}
