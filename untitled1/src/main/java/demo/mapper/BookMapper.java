package demo.mapper;

import demo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> selectAll();

    Book selectById(Integer id);

    Integer addBook(Book book);

    Integer deleteBooksByIds(List<Integer> ids);

    Integer deleteBookById(Integer id);

    Integer updateBook(Book book);
}
