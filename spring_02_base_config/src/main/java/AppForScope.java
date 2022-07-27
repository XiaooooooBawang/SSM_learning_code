import com.XiaooooooBawang.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService1 = (BookService) ctx.getBean("service");
        BookService bookService2 = (BookService) ctx.getBean("service");
        System.out.println(bookService1);
        System.out.println(bookService2);
    }
}
