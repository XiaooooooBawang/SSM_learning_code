package com.XiaooooooBawang;

import com.XiaooooooBawang.config.SpringConfig;
import com.XiaooooooBawang.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAop {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //bookDao.update();
        System.out.println(bookDao.getClass());
    }
}
