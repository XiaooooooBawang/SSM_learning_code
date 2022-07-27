package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    //@Autowired可以写在属性上，也可也写在setter方法上，最简单的处理方式是`写在属性上并将setter方法删除掉`
    @Qualifier("bookDao2")
    //Qualifier注解后的值就是需要注入的bean的名称。==注意:@Qualifier不能独立使用，必须和@Autowired一起使用==
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save");
    }
}
