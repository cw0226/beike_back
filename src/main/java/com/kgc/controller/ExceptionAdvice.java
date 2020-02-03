package com.kgc.controller;

import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e){
        return new Result(null,"返回异常："+e.getMessage(),101);
    }
}
