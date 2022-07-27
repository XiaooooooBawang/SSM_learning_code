import com.XiaooooooBawang.dao.OrderDao;
import com.XiaooooooBawang.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class AppForInstanceOrder {
    public static void main(String[] args) {
//        手动方式的静态工厂实例化
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

//        Spring管理静态工厂实例化
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
