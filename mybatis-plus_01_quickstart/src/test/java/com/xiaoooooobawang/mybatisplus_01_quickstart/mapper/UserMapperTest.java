package com.xiaoooooobawang.mybatisplus_01_quickstart.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoooooobawang.mybatisplus_01_quickstart.domain.User;
import com.xiaoooooobawang.mybatisplus_01_quickstart.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    /**
     * 有两套CRUD接口:
     * mapper CRUD 接口 和 service CRUD 接口
     */


    /**
     * 通用 CRUD 封装BaseMapper (opens new window)接口，
     * 为 Mybatis-Plus 启动时自动解析实体表关系映射转换为 Mybatis 内部对象注入容器
     */
    @Resource
    private UserMapper userMapper;


    /**
     * 通用 Service CRUD 封装IService (opens new window)接口，进一步封装 CRUD ,采用
     * get 查询单行
     * remove 删除
     * list 查询集合
     * page 分页 前缀命名方式区分 Mapper 层避免混淆，
     */
    @Resource
    private UserService userService;

    //增
    @Test
    void testSave() {
        User user = new User();
        user.setName("ababa");
        user.setAge(2);
        user.setTel("2345445");
        user.setPassword("87654321");
        //userMapper.insert(user);    //mapper接口
        userService.save(user);    //service接口
    }

    //删
    @Test
    void testRemoveById() {
        //userMapper.deleteById(5);
        userService.removeById(5);
    }

    //改
    @Test
    void testUpdateById() {
        User user = new User();
        user.setId(4L);
        user.setName("ccc");
        //userMapper.updateById(user);
        userService.updateById(user);
    }
    //查

    //根据id查询
    @Test
    void testGetById() {
        User user1 = userMapper.selectById(2);
        User user2 = userService.getById(2);
        System.out.println(user1);
        System.out.println(user2);
    }

    //查询全部
    @Test
    void testSelectAll() {
        List<User> userList1 = userMapper.selectList(null);
        List<User> userList2 = userService.list(null);
        System.out.println(userList1);
        System.out.println(userList2);
    }


    /**
     * 分页查询
     *
     * 要想有结果，还需在 MybatisPlusConfig 添加分页拦截器
     */
    @Test
    void testPage() {
        //1、 创建IPage分页对象,设置分页参数,1为当前页码，3为每页显示的记录数
        IPage<User> page = new Page<>(1, 3);
        //2、执行分页查询
//        userMapper.selectPage(page, null);
        userService.page(page);
        //3、 获取分页结果
        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
    }

}