package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;

public class BookServiceImpl implements BookService {
    //InitializingBean, DisposableBean实现这两个接口中的afterPropertiesSet和destroy实现bean初始化和销毁

    private BookDao bookDao;//自动装配只能对引用类型数据，不能对基本类型数据

    //自动装配还是要保留setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save");
    }

}
