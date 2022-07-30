package com.XiaooooooBawang.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
//定义拦截器类，实现HandlerInterceptor接口
//注意当前拦截器类要被SpringMVC容器扫描到
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    //原始方法调用前执行的内容
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*
        使用率最高的还是这个方法
         * request:请求对象
         * response:响应对象
         * handler:被调用的处理器对象，本质上是一个方法对象，对反射中的Method对象进行了再包装
         */
        String ContentType = request.getHeader("Content-Type");  //使用request对象可以获取请求数据中的内容，如获取请求头的`Content-Type`
        HandlerMethod hm = (HandlerMethod) handler;
        String methodName = hm.getMethod().getName();//可以获取方法的名称
        System.out.println("preHandler  " + ContentType + "  " + methodName);
        return true;
//      如果方法返回true，则放行继续执行后面的handle[controller的方法]和后面的方法
//	    如果返回false，则直接跳过后面方法的执行。
    }

    @Override
    //原始方法调用后执行的内容
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        modelAndView:如果处理器执行完成具有返回结果，可以读取到对应数据与页面信息，并进行调整
//        因为咱们现在都是返回json数据，所以该参数的使用率不高。
        System.out.println("postHandle");
    }

    @Override
    //原始方法调用完成后执行的内容
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        ex:如果处理器执行过程中出现异常对象，可以针对异常情况进行单独处理
//        因为我们现在已经有全局异常处理器类，所以该参数的使用率也不高。
        System.out.println("afterCompletion");
    }
}
