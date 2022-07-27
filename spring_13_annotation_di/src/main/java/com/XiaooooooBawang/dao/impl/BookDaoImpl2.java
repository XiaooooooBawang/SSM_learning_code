package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
//注意:@Component注解不可以添加在接口上，因为接口是无法创建对象的。
public class BookDaoImpl2 implements BookDao {
    @Value("sdfhjksd")
    private String name;
    @Value("${num}")
    private int num;
    @Override
    public void save() {
        System.out.println("book dao save 2 " + name + " " + num);
    }
}
