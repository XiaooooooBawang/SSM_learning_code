package com.XiaooooooBawang.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.XiaooooooBawang.dao.BookDao.findName(..))")
    private void pt(){}

//    @Before("Advice.pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();   //before获取参数
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..." );
    }

//    @After("Advice.pt()")
    public void after(JoinPoint jp) {   //after获取参数
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    /*只有around和afterreturning能获得返回值*/
    /*只有`AfterThrowing`和`Around`能获取异常*/

    @Around("Advice.pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();   //around获取原始参数
        System.out.println(Arrays.toString(args));

        args[0] = 5645;  //参数处理
        Object res = null;
        try {
            res = proceedingJoinPoint.proceed(args);   //传参给代理对象
        } catch (Throwable throwable) {   //around获取异常
            throwable.printStackTrace();
        }
        return res;  //around获取返回值
    }

    @AfterReturning(value = "Advice.pt()", returning = "ret")   //AfterReturning获取返回值
    public void afterReturning(JoinPoint jp, Object ret) {  //如果有jointpoint参数，顺序必须先jointpoint参数再返回值参数
        //返回值参数类型可以写成String，但是为了能匹配更多的参数类型，建议写成Object类型
        Object[] args = jp.getArgs();   //afterReturning获取参数
        System.out.println(Arrays.toString(args));
        System.out.println("afterReturning advice ..."+ret);
    }

//    @AfterThrowing(value = "Advice.pt()", throwing = "t")  //AfterThrowing获取异常
    public void afterThrowing(JoinPoint jp, Throwable t) {
        Object[] args = jp.getArgs();   //afterThrowing获取参数
        System.out.println(Arrays.toString(args));
        System.out.println("afterThrowing advice ..." + t);
    }

}
