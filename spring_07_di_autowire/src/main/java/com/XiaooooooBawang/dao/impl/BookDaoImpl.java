package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    @Override
    public void save() {
        System.out.println("book dao save  " + databaseName + "," + connectionNum);
    }

}
