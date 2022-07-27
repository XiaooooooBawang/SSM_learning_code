package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao")
//注意:@Component注解不可以添加在接口上，因为接口是无法创建对象的。
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dap save ");
    }
}
