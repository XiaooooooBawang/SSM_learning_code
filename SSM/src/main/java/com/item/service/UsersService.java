package com.item.service;

import com.item.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersService {
    /**
     * 获取所有
     * @return
     */
    List<Users> GetInfo();

    /**
     * 获取nickName的模糊查询结果集
     * @param nickName
     * @return
     */
    List<Users> SelectName(String nickName);

    /**
     * id精准查询
     * @param id
     * @return
     */
    Users UsersSelectById(int id);

    /**
     * 添加信息
     * @param userName
     * @param pwd
     * @param nickName
     * @return
     */
    int UsersAddInfo(
            String userName,
            String pwd,
            String nickName
    );

    /**
     * 修改密码
     * @param pwd
     * @param id
     * @return
     */
    int UsersUpdateInfo(
            String pwd,
            int id
    );

    /**
     * 删除信息
     * @param id
     * @return
     */
    int UsersDeleteById(int id);
}