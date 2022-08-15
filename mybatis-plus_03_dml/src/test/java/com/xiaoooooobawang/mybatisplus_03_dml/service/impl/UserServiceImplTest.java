package com.xiaoooooobawang.mybatisplus_03_dml.service.impl;

import com.xiaoooooobawang.mybatisplus_03_dml.domain.User;
import com.xiaoooooobawang.mybatisplus_03_dml.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    void testBatchOperation() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        userService.removeBatchByIds(list);
    }
}