package com.XiaooooooBawang.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
        //springMVC会拦截所有“/”路径往下的访问，去找对应的controller，
        //会造成拦截静态资源访问（这个应该是访问tomcat容器的，而不是mvc），访问http://localhost/pages/books.html 静态资源是访问不到的，会走SpringMvc，被拉去找controller，找不到就报错
    }



    //过滤器解决中文乱码处理

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();//字符过滤器
        filter.setEncoding("UTF-8");//设置字符集
        return new Filter[]{filter};
    }
}

