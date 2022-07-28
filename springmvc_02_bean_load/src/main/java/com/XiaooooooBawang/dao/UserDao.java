package com.XiaooooooBawang.dao;

import com.XiaooooooBawang.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    void save(User user);
}
