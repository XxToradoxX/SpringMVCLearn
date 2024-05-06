package demo.service.impl;

import demo.mapper.DemoMapper;
import demo.pojo.Book;
import demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoMapper demoMapper;
    @Override
    public List<Book> selectAll() {
        return demoMapper.selectAll();
    }
}
