package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.dao.UserDao;
import com.XiaooooooBawang.service.BookService;

public class BookServiceImpl implements BookService {
    //InitializingBean, DisposableBean实现这两个接口中的afterPropertiesSet和destroy实现bean初始化和销毁

    private BookDao bookDao;
    private UserDao userDao;

    //构造器注入多个数据

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        bookDao.save();
        userDao.save();
        System.out.println("book service save");
    }

}
