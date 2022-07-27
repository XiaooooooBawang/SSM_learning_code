package com.item.dao;

import com.item.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    List<Users> GetInfo();
    List<Users> SelectName(@Param("nickName") String nickName);
    Users UsersSelectById(@Param("id") int id);
    int UsersAddInfo(
            @Param("userName") String userName,
            @Param("pwd") String pwd,
            @Param("nickName") String nickName
    );
    int UsersUpdateInfo(
            @Param("pwd") String pwd,
            @Param("id") int id
    );
    int UsersDeleteById(@Param("id") int id);
}