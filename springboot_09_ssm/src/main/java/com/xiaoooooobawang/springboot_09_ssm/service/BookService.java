package com.xiaoooooobawang.springboot_09_ssm.service;

import com.xiaoooooobawang.springboot_09_ssm.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    boolean save(Book book);

    boolean update(Book book);

    boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

}
