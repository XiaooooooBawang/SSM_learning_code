package com.XiaooooooBawang.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */




    //配置当前接口方法具有事务
    @Transactional   //如果设置在类或接口上方则类或接口中所有方法均添加事务，最好用在类或接口上，降低耦合
    void transfer(String out,String in ,Double money) ;
}
