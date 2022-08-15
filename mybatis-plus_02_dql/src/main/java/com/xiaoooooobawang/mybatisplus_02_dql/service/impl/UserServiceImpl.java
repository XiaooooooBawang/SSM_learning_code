package com.xiaoooooobawang.mybatisplus_02_dql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoooooobawang.mybatisplus_02_dql.domain.User;
import com.xiaoooooobawang.mybatisplus_02_dql.mapper.UserMapper;
import com.xiaoooooobawang.mybatisplus_02_dql.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 小霸王
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-08-14 23:49:11
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




