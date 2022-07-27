package com.XiaooooooBawang.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类类
@Aspect
public class MyAdvice {
    //设置切入点，要求配置在方法上方,增强update方法
    @Pointcut("execution(void com.XiaooooooBawang.dao.BookDao.update())")
    private void pt(){}
    //切入点定义依托一个不具有实际意义的方法进行，即无参数、无返回值、方法体无实际逻辑


    //切入点与通知绑定，设置在切入点pt()的前面运行当前操作（前置通知）
    @Before("pt()")
    public void before(){
        System.out.println(System.currentTimeMillis());
    }
}
