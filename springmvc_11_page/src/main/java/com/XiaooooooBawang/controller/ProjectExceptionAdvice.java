package com.XiaooooooBawang.controller;

import com.XiaooooooBawang.exception.BusinessException;
import com.XiaooooooBawang.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
//异常是各个层的异常不断往上层抛，最后抛到controller层，然后抛给异常处理器类，也就是这里，进行统一异常处理，并把结果返回给前端
public class ProjectExceptionAdvice {  //异常处理器类

    //下面是三个异常处理器（分别处理系统异常，业务异常和其他异常），有了异常处理器，SpringMVC就能拦截异常

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException systemException) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,systemException对象发送给开发人员
        System.out.println("出系统异常了");
       return new Result(systemException.getCode(), null, systemException.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException businessException) {
        System.out.println("出业务异常了");
        return new Result(businessException.getCode(), null, businessException.getMessage());
    }

    @ExceptionHandler(Exception.class)   //处理exception类型的所有异常，也就是其他异常，编写程序时不可预料到的
    public Result doException(Exception e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,e对象发送给开发人员
        System.out.println("出其他异常了");
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统异常，请稍后再试");
    }
}
