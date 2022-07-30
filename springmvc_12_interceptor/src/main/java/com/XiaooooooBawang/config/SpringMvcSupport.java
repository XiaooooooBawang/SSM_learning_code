package com.XiaooooooBawang.config;

import com.XiaooooooBawang.controller.interceptor.ProjectInterceptor;
import com.XiaooooooBawang.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //配置拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");  //不加"/books/*"，访问/books/1是不会被拦截的
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books", "/books/*");

        /* 配置拦截器链
         * 当配置多个拦截器时，形成拦截器链
         * 拦截器链的运行顺序参照拦截器添加顺序为准
         * 当拦截器中出现对原始处理器的拦截，后面的拦截器均终止运行
         * 当拦截器运行中断，仅运行配置在前面的拦截器的afterCompletion操作
         *
         * preHandle：与配置顺序相同，必定运行
         * postHandle:与配置顺序相反，可能不运行
         * afterCompletion:与配置顺序相反，可能不运行。
        */
    }
}
