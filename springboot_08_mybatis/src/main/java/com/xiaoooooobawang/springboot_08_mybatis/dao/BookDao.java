package com.xiaoooooobawang.springboot_08_mybatis.dao;

import com.xiaoooooobawang.springboot_08_mybatis.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
//springboot没有了配置类，没有地方去扫描，所以这里需要用mapper注解告诉mybatis代理一下bookdao
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
