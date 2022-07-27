package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }
    //bean初始化对应的操作
    public void init() {
        System.out.println("init");
    }
    //bean销毁前对应的操作
    public void destroy() {
        System.out.println("destroy");
    }
}
