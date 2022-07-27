package com.XiaooooooBawang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
//在配置类上添加`@Configuration`注解，将其标识为一个配置类,替换`applicationContext.xml`,设定当前类为Spring配置类
@ComponentScan("com.XiaooooooBawang")
//在配置类上添加包扫描注解`@ComponentScan`替换`<context:component-scan base-package=""/>`

@Import(JdbcConfig.class)
//方法二：新建一个独立的jdbc配置类，然后import导入
//import只能写一次，要导入多个就写成数组形式

@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
//    方法一：直接在spring的config下配置jdbc配置类，但不太好
//    @Bean //@Bean注解的作用是将方法的返回值制作为Spring管理的一个bean对象
//    //@Bean("dataSource") 给bean起名
//    //定义一个方法来获得要管理的第三方对象
//    public DataSource dataSource() {
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:");
//        ds.setUsername("root");
//        ds.setPassword("root");
//        return ds;
//    }
}
