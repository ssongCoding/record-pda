package com.example.record.auth;

import lombok.Getter;

@Getter
public class JoinReqDto {
    private String userId;
    private String pw;
    private String name;
    private String mbti;

    public Member toEntity() {
        return new Member(userId, pw, name, mbti);
    }

    @Override
    public String toString() {
        return "JoinReqDto{" +
                "userId='" + userId + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", mbti='" + mbti + '\'' +
                '}';
    }
}
