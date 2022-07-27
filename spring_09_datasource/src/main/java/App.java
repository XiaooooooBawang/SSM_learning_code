import com.XiaooooooBawang.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource druidDataSource = (DataSource) ctx.getBean("druidDataSource");
//        System.out.println(druidDataSource);
//        DataSource c3p0DataSource = (DataSource) ctx.getBean("c3p0DataSource");
//        System.out.println(c3p0DataSource);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
