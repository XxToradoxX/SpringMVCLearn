package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/getBook")
    public Result GetBook() {
        List<Book> bookList = bookService.selectAll();
        return new Result("200200", "获得BOOKLIST", bookList);
    }
}
