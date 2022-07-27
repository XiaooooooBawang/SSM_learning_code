import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        //获取IOC容器
        //ApplicationContext是接口，ClassPathXmlApplicationContext是其接口实现类
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取相应id对应的bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
