package com.xiaoooooobawang.mybatisplus_03_dml.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoooooobawang.mybatisplus_03_dml.domain.User;
import com.xiaoooooobawang.mybatisplus_03_dml.mapper.UserMapper;
import com.xiaoooooobawang.mybatisplus_03_dml.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 小霸王
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-08-15 15:20:15
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




