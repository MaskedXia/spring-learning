package com.pipe.demo04.controller;

import com.pipe.demo04.exception.BusinessException;
import com.pipe.demo04.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 处理不同异常
@RestControllerAdvice
public class AppException {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(Code.UNKNOW_ERR, null, "system is busy, please try again");
    }
}
