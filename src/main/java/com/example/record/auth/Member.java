package com.example.record.auth;

public class Member {
    private String userId;
    private String pw;
    private String name;
    private String mbti;

    public Member(String userId, String pw, String name, String mbti) {
        this.userId = userId;
        this.pw = pw;
        this.name = name;
        this.mbti = mbti;
    }

    public String getUserId() {
        return userId;
    }
}
