package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    DemoService demoService;

    @PostMapping
    public Result GetBook() {
        List<Book> bookList = demoService.selectAll();
        return new Result("200200", "获得BOOKLIST", bookList);
    }
}
