package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.dao.AccountDao;
import com.XiaooooooBawang.service.AccountService;
import com.XiaooooooBawang.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    @Autowired
    private LogService logService;


    public void transfer(String out,String in ,Double money) throws IOException {
        try{
            accountDao.outMoney(out,money);


            int i = 1 / 0;   //这个异常事务会回滚

//            if(true){
//                throw new IOException(); //这个IO异常事务就不会回滚
//            }

            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);  //==无论转账操作是否成功，均进行转账操作的日志留痕==  用try-finally结构
        }
    }

}
