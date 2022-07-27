package com.XiaooooooBawang.mapper;

import com.XiaooooooBawang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
}
