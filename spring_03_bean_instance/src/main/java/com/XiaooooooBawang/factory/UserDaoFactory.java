package com.XiaooooooBawang.factory;

import com.XiaooooooBawang.dao.UserDao;
import com.XiaooooooBawang.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
