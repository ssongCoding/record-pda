package com.example.record.auth;

import com.example.record.exception.MemberExistException;
import com.example.record.utils.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    private MemberService memberService;

//    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/join")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<String> join(@RequestBody JoinReqDto joinReqDto) {
        String newUserId = memberService.join(joinReqDto);
        return ApiResponse.success(newUserId);
    }
}
