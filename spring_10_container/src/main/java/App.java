import com.XiaooooooBawang.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //加载类路径下的xml配置文件，推荐这种
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //加载文件系统下的XML配置文件
        //ApplicationContext ctx2 = new FileSystemXmlApplicationContext("D:\\JavaWebProject\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

        //获取bean方式
        //方法一
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //方法二
        BookDao bookDao1 = ctx.getBean("bookDao", BookDao.class);
        //方法三,类似于依赖注入中的按类型注入，若有多个同类型的bean会报错
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        bookDao2.save();
    }
}
