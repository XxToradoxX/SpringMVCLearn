package demo.controller;

import demo.pojo.Book;
import demo.pojo.Result;
import demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;
    public Result SelectAll(){
        List<Book> bookList = demoService.selectAll();
        return new Result("okok",null,bookList);
    }
}
