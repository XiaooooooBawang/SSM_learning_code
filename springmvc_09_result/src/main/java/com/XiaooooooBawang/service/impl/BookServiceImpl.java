package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.model.Book;
import com.XiaooooooBawang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
/*
    bookDao在Service中注入的会提示一个红线提示，为什么呢?

        * BookDao是一个接口，没有实现类，接口是不能创建对象的，所以最终注入的应该是代理对象
        * 代理对象是由Spring的IOC容器来创建管理的
        * IOC容器又是在Web服务器启动的时候才会创建
        * IDEA在检测依赖关系的时候，没有找到适合的类注入，所以会提示错误提示
        * 但是程序运行的时候，代理对象就会被创建，框架会使用DI进行注入，所以程序运行无影响。
*/

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
