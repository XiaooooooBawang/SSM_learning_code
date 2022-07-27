package com.XiaooooooBawang.config;

import com.XiaooooooBawang.dao.BookDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //@Value("com.mysql.jdbc.Driver")  //基本类型数据的第三方bean依赖注入
    @Value("${jdbc.driver}")
    private String driver;

    //@Value("jdbc")
    @Value("${jdbc.url}")
    private String url;

    //@Value("root")
    @Value("${jdbc.username}")
    private String username;

    //@Value("root")
    @Value("${jdbc.password}")
    private String pwd;

    @Bean
    public DataSource dataSource(BookDao bookDao) {  //设置形参
        System.out.println(bookDao);//若要注入引用类型数据，只需要为bean定义方法设置形参即可，不需要另外写其他配置之类的，容器会根据类型自动装配对象
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(pwd);
        return ds;
    }
}
