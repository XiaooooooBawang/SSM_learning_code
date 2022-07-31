package com.xiaoooooobawang.springboot_09_ssm.service.impl;

import com.xiaoooooobawang.springboot_09_ssm.controller.Code;
import com.xiaoooooobawang.springboot_09_ssm.dao.BookDao;
import com.xiaoooooobawang.springboot_09_ssm.exception.BusinessException;
import com.xiaoooooobawang.springboot_09_ssm.model.Book;
import com.xiaoooooobawang.springboot_09_ssm.service.BookService;
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
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {

        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常

        if (id == 1) {  //具体的包装方式有：方式一:直接throw自定义异常即可
            //自己抛一个业务异常
            throw new BusinessException(Code.BUSINESS_ERR, "你牛你来当程序员!");
        }

//        try {   //方式二:`try{}catch(){}`在catch中重新throw我们自定义异常即可。
//            int i = 1 / 0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请稍后重试！", e);  //当作是系统异常
//        }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
