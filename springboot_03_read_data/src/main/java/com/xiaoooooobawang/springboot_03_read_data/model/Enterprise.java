package com.xiaoooooobawang.springboot_03_read_data.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//将实体类 `bean` 的创建交给 `Spring` 管理。在类上添加 `@Component` 注解
@ConfigurationProperties(prefix = "enterprise")
//使用 `@ConfigurationProperties` 注解表示加载配置文件
//在该注解中也可以使用 `prefix` 属性指定只加载指定前缀的数据
public class Enterprise {
    private String name;
    private int age;
    private String tel;
    private String[] subject;

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
}
