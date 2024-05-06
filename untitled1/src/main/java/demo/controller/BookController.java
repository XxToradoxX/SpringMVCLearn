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
    @PostMapping
    public Result GetBook(@RequestBody Book book) {
        return new Result("200200", "OKOK", book);
    }
}
