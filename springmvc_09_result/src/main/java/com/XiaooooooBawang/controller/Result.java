package com.XiaooooooBawang.controller;

//结果封装
public class Result {
    //描述统一格式中的数据
    private Object data;

    //描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;

    //描述统一格式中的消息，可选属性
    private String message;

    public Result() {
    }

    //构造方法是方便对象的创建
    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
