package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.dao.UserDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {
    //InitializingBean, DisposableBean实现这两个接口中的afterPropertiesSet和destroy实现bean初始化和销毁

    private BookDao bookDao;
    private UserDao userDao;
    @Override
    public void save() {
        bookDao.save();
        userDao.save();
        System.out.println("book service save");
    }

    //提供setter方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set book dao");
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("set user dao");
        this.userDao = userDao;
    }
}
