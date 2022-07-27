package com.XiaooooooBawang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    //匹配业务层的所有方法为切入点
    @Pointcut("execution(* com.XiaooooooBawang.service.*Service.*(..))")
    private void servicePt() {
    }

    //设置环绕通知，在原始操作的运行前后记录执行时间
    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {

        Signature signature = pjp.getSignature();//获取执行的签名对象
        String className = signature.getDeclaringTypeName();//通过签名获取执行操作名称(接口名)
        String methodName = signature.getName();//通过签名获取执行操作名称(方法名)

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行：" + className + "." + methodName + "---->" + (end - start) + "ms");
    }

}
