package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.management.DescriptorRead;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //InitializingBean, DisposableBean实现这两个接口中的afterPropertiesSet和destroy实现bean初始化和销毁

    private BookDao bookDao;
    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save");
    }

    //提供setter方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set book dao");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //afterPropertiesSet方法，翻译过来为`属性设置之后`,先执行setBookDao，再执行这个
        System.out.println("service init");
    }
}
