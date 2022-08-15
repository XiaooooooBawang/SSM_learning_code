package com.xiaoooooobawang.mybatisplus_02_dql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaoooooobawang.mybatisplus_02_dql.domain.User;
import com.xiaoooooobawang.mybatisplus_02_dql.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

@SpringBootTest
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    void testGetAll() {
        List<User> user = userService.list();
        System.out.println(user);
    }

    //条件查询

    /**
     * 注意最好全部wrapper都加泛型
     */
    @Test
    void testQueryWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //lt: 小于(<)
        queryWrapper.lt("age", 18);
        List<User> users = userService.list(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testQueryWrapperUseLambda() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //在写条件的时候，容易出错，比如age写错，就会导致查询不成功,用lambda则不怕写错，queryWrapper后面多一层lambda()调用
        queryWrapper.lambda().lt(User::getAge, 18);
        List<User> users = userService.list(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testLambdaQueryWrapper() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //用LambdaQueryWrapper可以少写一层lambda()调用，哪种顺眼用哪种
        lambdaQueryWrapper.lt(User::getAge, 18);
        List<User> users = userService.list(lambdaQueryWrapper);
        System.out.println(users);
    }

    @Test
    void testMultiQueryWrapper() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //多条件默认是and，也就是大于1岁且小于18岁
        lambdaQueryWrapper.lt(User::getAge, 18);
        lambdaQueryWrapper.gt(User::getAge, 1);
        List<User> users = userService.list(lambdaQueryWrapper);
        System.out.println(users);


        lambdaQueryWrapper.clear();
        //可以用链式表达
        //大于18岁或小于1岁
        lambdaQueryWrapper.gt(User::getAge, 18).or().lt(User::getAge, 1);
        users = userService.list(lambdaQueryWrapper);
        System.out.println(users);
    }

    //查询指定字段
    @Test
    void testSelectSomeColum() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.select(User::getName, User::getAge);
        List<User> users = userService.list(lambdaQueryWrapper);
        System.out.println(users);
    }

    //聚合函数查询和分组查询
    @Test
    void testGroup() {
        //聚合与分组查询，无法使用lambda表达式来完成,只能用QueryWrapper
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("count(*) as cnt, tel");
        queryWrapper.groupBy("tel");
        List<Map<String, Object>> users = userService.listMaps(queryWrapper);  //用的是map
        System.out.println(users);
    }
}