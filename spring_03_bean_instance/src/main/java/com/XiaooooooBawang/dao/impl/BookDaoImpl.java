package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl() {
        System.out.println("book dao constructor is running");
    }
    @Override
    public void save() {
        System.out.println("book dao save");
    }

}
