package demo.service;

import demo.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> selectAll();

    Book selectById(Integer id);

    Integer addBook(Book book);
}
