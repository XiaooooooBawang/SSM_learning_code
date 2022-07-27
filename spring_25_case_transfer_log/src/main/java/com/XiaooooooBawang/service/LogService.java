package com.XiaooooooBawang.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    /*！！！事务传播行为：事务协调员对事务管理员所携带事务的处理态度*/


    //@Transactional   //默认log的事务加入transfer事务，转账的事务和log的事务同属transfer的事务，转账要回滚就会让log也回滚


    //propagation设置事务属性：传播行为设置为当前操作需要新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)  //虽然log事务位置在transfer中，但log新开一个事务，不归transfer事务管理员管
    void log(String out, String in, Double money);
}
