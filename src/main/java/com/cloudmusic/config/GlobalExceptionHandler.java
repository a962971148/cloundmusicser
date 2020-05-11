package com.cloudmusic.config;

import com.cloudmusic.constants.ResponseEntity;
import com.cloudmusic.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by taoye on 2020/5/11.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity hanlerException(BusinessException e){
        return ResponseEntity.failed(e.getMessage() , null);
    }



    @ExceptionHandler(Exception.class)
    public ResponseEntity hanlerException(Exception e){
        return ResponseEntity.failed(e.getMessage() , null);
    }
}
