package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/ttst1")
    public Result GetBook(@RequestBody Book book) {
        System.out.println(book);
        return new Result("200200", null, book);
    }
}
