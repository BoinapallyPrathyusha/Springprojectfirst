package org.trysol.handler;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String methodArgumentNotValidException(MethodArgumentNotValidException ex){
        return ex.getFieldError().getDefaultMessage();
    }

}
