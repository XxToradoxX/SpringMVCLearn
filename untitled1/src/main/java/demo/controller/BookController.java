package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import demo.service.BookService;
import org.apache.ibatis.annotations.Delete;
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
        return new Result("200200", "获得BOOK,id is " + id, bookObject);
    }

    @PostMapping("/addBook")
    public Result AddBook(@RequestBody Book book) {
        System.out.println(book);
        Integer flag = bookService.addBook(book);
        if (flag != 0) {
            return new Result("200200", "添加成功", book.getBookId());
        } else {
            return new Result("400000", "添加失败", null);
        }
    }

    @DeleteMapping("/deleteBooksByIds")
    public Result deleteBooksByIds(@RequestParam("ids") List<Integer> ids) {
        System.out.println(ids);
        Integer flag = bookService.deleteBooksByIds(ids);
        if (flag != 0) {
            return new Result("200200", "Delete Complete", flag);
        } else {
            return new Result("400000", "delete not found", null);
        }
    }

    @DeleteMapping("{id}")
    public Result deleteBookById(@PathVariable("id") Integer id) {
        Integer flag = bookService.deleteBookByid(id);
        if (flag != 0) {
            return new Result("200200", "Delete Complete", flag);
        } else {
            return new Result("400000", "delete not found", null);
        }
    }

    @PostMapping("/updateBook")
    public Result updateBook(@RequestBody Book book) {
        Integer flag = bookService.updateBook(book);
        if (flag != 0) {
            return new Result("200200", "update Complete", flag);
        } else {
            return new Result("400000", "update not complete", null);
        }
    }
}
