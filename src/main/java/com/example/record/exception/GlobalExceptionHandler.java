package com.example.record.exception;

import com.example.record.product.Product;
import com.example.record.utils.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(MemberExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ApiResponse<String> handleMemberExistException(MemberExistException e) {
        return ApiResponse.fail(e.getMessage());
    }

    @ExceptionHandler(NoSuchProductException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiResponse<Product> handleNoSuchProductException (NoSuchProductException e){
        return ApiResponse.fail(e.getMessage());
    }
}
