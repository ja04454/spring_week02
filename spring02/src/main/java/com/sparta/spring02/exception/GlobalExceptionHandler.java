package com.sparta.spring02.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    // View를 사용하지 않고 Rest API로만 사용할 때 쓸 수 있는 @RestControllerAdvice 사용
    // handleCustomException 은 직접 정의한 CustomException 사용
    // Exception 발생 시 넘겨받은 ErrorCode를 사용, 사용자에게 보여주는 에러 메세지를 정의한다.
    @ExceptionHandler(value = CustomException.class)
    protected ResponseEntity<ErrorResponse> handleCustomException(CustomException e){
        log.error("handleCustomException throw CustomException : {}", e.getErrorCode());
        return ErrorResponse.toResponseEntity(e.getErrorCode());
    }
}
