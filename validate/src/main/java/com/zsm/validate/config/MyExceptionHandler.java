package com.zsm.validate.config;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理
 */
@RestControllerAdvice
public class MyExceptionHandler{
    /**
     * 参数绑定异常处理
     * @param e
     * @param result
     * @return
     */
    @ExceptionHandler(BindException.class)
    public Object bindException(Exception e, BindingResult result){
        System.out.println("异常了");
        String msg = null;
        if(result.hasErrors()){
            for(ObjectError error : result.getAllErrors()){
                 msg = error.getDefaultMessage();
            }
        }
        return msg;
    }
}
