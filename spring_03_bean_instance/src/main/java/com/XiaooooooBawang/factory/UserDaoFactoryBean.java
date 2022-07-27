package com.XiaooooooBawang.factory;

import com.XiaooooooBawang.dao.UserDao;
import com.XiaooooooBawang.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //统一用getObject代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    //返回所创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        //return FactoryBean.super.isSingleton();默认单例
        //return true;
        return false;
    }
}
