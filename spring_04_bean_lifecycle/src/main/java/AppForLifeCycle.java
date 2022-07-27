import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        //ApplicationContext中没有close方法
        //需要将ApplicationContext更换成ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        //在容器关闭之前，提前设置好回调函数，让JVM在退出之前回调此函数来关闭IOC容器，关闭钩子放哪都行，registerShutdownHook()是在JVM退出前调用关闭
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        //ctx.close();  关闭IOC容器，close()是在调用的时候关闭
    }
}
