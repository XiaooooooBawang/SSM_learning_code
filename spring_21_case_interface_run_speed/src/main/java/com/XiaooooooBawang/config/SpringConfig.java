package com.XiaooooooBawang.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.XiaooooooBawang")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
