package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dap save " + name);
    }
}
