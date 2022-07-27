import com.XiaooooooBawang.config.SpringConfig;
import com.XiaooooooBawang.dao.BookDao;
import com.XiaooooooBawang.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
