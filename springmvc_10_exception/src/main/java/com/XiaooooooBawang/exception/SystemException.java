package com.XiaooooooBawang.exception;


//自定义异常类，用于封装异常信息，对异常进行分类
//系统异常
public class SystemException extends RuntimeException{
    /*
    这个exception包中的类是异常类，用来给异常分类的

     * 让自定义异常类继承`RuntimeException`的好处是，后期在抛出这两个异常的时候，就不用在try...catch...或throws了
     * 自定义异常类中添加`code`属性的原因是为了更好的区分异常是来自哪个业务的
     */
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
