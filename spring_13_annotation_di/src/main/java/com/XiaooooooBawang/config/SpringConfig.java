package com.XiaooooooBawang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//在配置类上添加`@Configuration`注解，将其标识为一个配置类,替换`applicationContext.xml`,设定当前类为Spring配置类
@ComponentScan("com.XiaooooooBawang")
//在配置类上添加包扫描注解`@ComponentScan`替换`<context:component-scan base-package=""/>`
@PropertySource("classpath:jdbc.properties")
//注解读取properties配置文件,但不支持使用通配符`*`
public class SpringConfig {
}
