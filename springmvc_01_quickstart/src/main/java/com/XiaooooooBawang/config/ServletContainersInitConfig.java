package com.XiaooooooBawang.config;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//定义一个servlet容器启动的配置类，在里面加载spring配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    //加载springmvc配置类
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        /*createServletApplicationContext方法，创建Servlet容器时，
        加载SpringMVC对应的bean并放入WebApplicationContext对象范围中，
        而WebApplicationContext的作用范围为ServletContext范围，即整个web容器范围
        */
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext(); //注意类名名
        //注册指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置由springmvc控制器处理的请求映射路径,即SpringMVC拦截哪些请求
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  //所有请求都归springMVC管
    }

    //加载spring配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
