package com.kgc.utils;


/**
 * code：
 *      100:请求成功
 *      101:请求异常
 *      102:登录失败
 *      103:未登录
 *      104:请求不到数据
 *      200:旧密码验证正确
 */
public class Result {
    private Object data;        //数据
    private String message;     //消息
    private int code;           //状态码

    public Result() {
    }

    public Result(Object data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
