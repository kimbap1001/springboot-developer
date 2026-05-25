package me.cheonil.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.cheonil.springbootdeveloper.dto.AddUserRequest;
import me.cheonil.springbootdeveloper.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Configuration
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request); //회원가입 메서드 호출
        return "redirect:/login"; //회원가입이 완료된 이후에 로그인 페이지로 이동
    }
}
