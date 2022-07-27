package com.XiaooooooBawang.dao.impl;

import com.XiaooooooBawang.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
@Scope("prototype")
//@Scope设置bean的作用范围
//默认值singleton（单例），可选值prototype（非单例）
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dap save ");
    }

    @PostConstruct
    //在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("init");
    }
    @PreDestroy
    //在销毁方法之前执行,替换 destroy-method  `destroy`只有在容器关闭的时候，才会执行
    public void destroy() {
        System.out.println("destroy");
    }
}
