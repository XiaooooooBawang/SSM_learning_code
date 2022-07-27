package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.service.BookService;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save");
    }
}
