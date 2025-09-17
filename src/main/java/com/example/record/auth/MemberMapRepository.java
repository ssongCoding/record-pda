package com.example.record.auth;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberMapRepository {
    private Map<String, Member> db
            = new HashMap<>();

    public String saveMember(Member member) {
        db.put(member.getUserId(), member);
        return db.get(member.getUserId()).getUserId();
    }

    public boolean isExistMember(String newUserId) {
        return db.containsKey(newUserId);
    }
}
