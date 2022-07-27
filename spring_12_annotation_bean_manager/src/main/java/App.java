import com.XiaooooooBawang.config.SpringConfig;
import com.XiaooooooBawang.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao1);
        ctx.close();
    }
}
