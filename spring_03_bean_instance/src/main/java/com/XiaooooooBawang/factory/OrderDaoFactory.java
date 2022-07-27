package com.XiaooooooBawang.factory;

import com.XiaooooooBawang.dao.OrderDao;
import com.XiaooooooBawang.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory startup");
        return new OrderDaoImpl();
    }
}
