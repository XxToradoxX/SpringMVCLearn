package demo.service.impl;

import demo.mapper.BookMapper;
import demo.pojo.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    BookMapper bookMapper;
    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }

    @Override
    public Book selectById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public Integer addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public Integer deleteBooksByIds(List<Integer> ids) {
        return bookMapper.deleteBooksByIds(ids);
    }
}
