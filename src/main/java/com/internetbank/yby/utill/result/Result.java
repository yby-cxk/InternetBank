package com.internetbank.yby.utill.result;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;         //未知类型的对象

    //传入ResultCode,将ResultCode 的属性值交给当前的属性
    //为了以后返回Result信息的完备性，便捷

    private void setResultCode(ResultCode resultCode){
        code=resultCode.getCode();
        message=resultCode.getMessage();
    }

    //默认错误结果(码，信息)
    //静态方法用类名调用：类名 方法名
    //<T>未知类型的声明，这里是 泛型方法
    //Result<T> 返回值类型
    private static <T> Result<T> failure(){
        Result<T> result=new Result<>();
        return result;
    }
    public static <T> Result<T> faliure(T data){
        Result<T> result=new Result<>();
        result.setResultCode(ResultCode.FAIL);
        result.setData(data);
        return result;

    }
    //自定义错误结果：码，信息
    public static <T> Result<T> failure(ResultCode resultCode){
        Result<T> result=new Result<>();
        result.setResultCode(resultCode);
        return result;
    }
    //自定义错误结果：码，信息,对象
    public static <T> Result<T> failure(ResultCode resultCode,T data){
        Result<T> result=new Result<>();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
    //默认成功：码，信息
    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        return result;

    }
    //成功：码、信息、对象
    public static <T> Result<T> success(T data){
        Result<T> result=new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }


}
