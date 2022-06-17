package com.sparta.spring02.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // 에러 형식을 Enum 클래스로 정의
    // 응답으로 보낼 HttpStatus와 에러 메세지로 사용할 String
    // ResponseStatusException 과 비슷해보이지만
    // 내가 정의한 새로운 Exception을 모두 한 곳에서 관리하고 재사용 할 수 있는 점이 다르다.
    WRONG_ID(BAD_REQUEST , "존재하지 않는 아이디"),
    INVALID_NICKNAME(BAD_REQUEST, "닉네임은 대소문자와 숫자로 구성해야 합니다"),
    INVALID_PASSWORD(BAD_REQUEST,"비밀번호는 닉네임과 같은 값을 포함할 수 없습니다"),
    LOGIN_ERR(BAD_REQUEST,"아이디/ 비밀번호를 확인해주세요"),
    NOT_EXIST_LIKE(BAD_REQUEST,"존재하지 않는 LikeId"),
    NOT_EXIST_BOARD(BAD_REQUEST,"존재하지 않는 BoardId"),
    NOT_EXIST_USER(BAD_REQUEST, "존재하지 않는 UserId"),
    PLEASE_LOGIN(BAD_REQUEST, "로그인 해주세요");

    private final HttpStatus httpStatus;
    private final String detail;

}
