package com.example.record.utils;

import lombok.Getter;

@Getter
public class ApiResponse<A> {
    private boolean success;    // 성공 여부
    private A response; // 응답 데이터 (각종 DTO)
    private String errorMessage;     // 에러 메세지

    public ApiResponse(boolean success, A response, String errorMessage) {
        this.success = success;
        this.response = response;
        this.errorMessage = errorMessage;
    }

    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>
                (true, data, null);
    }

    public static <T> ApiResponse<T> fail(String errorMessage) {
        return new ApiResponse<>
                (false, null, errorMessage);
    }
}
