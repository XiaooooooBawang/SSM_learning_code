package com.xiaoooooobawang.springboot_07_test.service.impl;

import com.xiaoooooobawang.springboot_07_test.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save");
    }
}
