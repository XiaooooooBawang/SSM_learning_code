package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import com.XiaooooooBawang.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save");
    }

    //提供setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
