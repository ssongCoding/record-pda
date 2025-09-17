package com.example.record.auth;

import com.example.record.exception.MemberExistException;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberMapRepository memberMapRepository;

    public MemberService(MemberMapRepository memberMapRepository) {
        this.memberMapRepository = memberMapRepository;
    }

    public String join(JoinReqDto joinReqDto) {
        String newUserId = joinReqDto.getUserId();
        if (memberMapRepository.isExistMember(newUserId))
            throw new MemberExistException("회원 중복");

        Member newMember = joinReqDto.toEntity();
        return memberMapRepository.saveMember(newMember);
    }
}
