package com.sparta.spring02.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
    // 전역으로 사용할 CustomException
    // RuntimeException을 상속받아 Unchecked Exception으로 활용
    // 생성자로 ErrorCode를 받는다
    private final ErrorCode errorCode;
}
