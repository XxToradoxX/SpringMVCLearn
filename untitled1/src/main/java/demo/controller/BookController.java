package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping()
    public Result GetBook() {
        List<Book> bookList = bookService.selectAll();
        return new Result("200200", "获得BOOKLIST", bookList);
    }

    @PostMapping("{id}")
    public Result getBookWithId(@PathVariable("id") Integer id) {
        Book bookObject = bookService.selectById(id);
        return new Result("200200", "获得BOOK,id = " + id, bookObject);
    }

    @PostMapping("/addBook")
    public Result AddBook(@RequestBody Book book) {
        System.out.println(book);
        Integer flag = bookService.addBook(book);
        if (flag != null) {
            return new Result("200200", "添加成功", book.getBookId());
        } else {
            return new Result("400000", "添加失败", null);
        }
    }

    @DeleteMapping("/deleteBooksByIds")
    public Result deleteBooksByIds(@RequestParam("ids")Integer[] ids) {
        Integer flag = bookService.deleteBooksByIds(ids);
        if (flag != null) {
            return new Result("200200", "Delete Complete", flag);
        } else {
            return new Result("400000", "delete not found", null);
        }
    }
}
