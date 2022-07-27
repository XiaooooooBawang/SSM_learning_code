package com.XiaooooooBawang.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    //rollback:设置当前事务参与回滚的异常，默认非运行时异常不参与回滚
    //Spring的事务只会对`Error异常`和`RuntimeException异常`及其子类进行事务回顾，其他的异常类型是不会回滚的
    @Transactional(rollbackFor = IOException.class)
//    @Transactional
    void transfer(String out,String in ,Double money) throws IOException;
}
