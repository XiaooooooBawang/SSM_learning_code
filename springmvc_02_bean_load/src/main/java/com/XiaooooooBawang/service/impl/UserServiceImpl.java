package com.XiaooooooBawang.service.impl;

import com.XiaooooooBawang.domain.User;
import com.XiaooooooBawang.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }
}
