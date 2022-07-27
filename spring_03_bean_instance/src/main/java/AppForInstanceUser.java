import com.XiaooooooBawang.dao.UserDao;
import com.XiaooooooBawang.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        手动实现实例化工厂实例化
//          创建实例工厂对象,因为里面的方法是非静态的
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        //通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

//        spring管理实例化工厂实例化
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
    }
}
