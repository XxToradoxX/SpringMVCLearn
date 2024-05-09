import demo.config.SpringConf;
import demo.pojo.Book;
import demo.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TTST {
    @Test
    public void ttst1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConf.class);
        BookService bookService = (BookService) applicationContext.getBean("bookServiceImpl");
        List<Book> bookList = bookService.selectAll();
        System.out.println(bookList);
    }
}
