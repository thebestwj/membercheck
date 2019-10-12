package com.wj.membercheck.mbweb.controller;

import com.wj.membercheck.biz.service.MemberService;
import com.wj.membercheck.mbcommon.dto.LoginResultDTO;
import com.wj.membercheck.mbdao.model.MemberDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
public class LoginController {
    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public LoginResultDTO login(@RequestParam String name,@RequestParam String pw, HttpServletRequest request ){
        MemberDO member = memberService.findByName(name);
        LoginResultDTO loginResultDTO= new LoginResultDTO();
        if (null == member){
            loginResultDTO.setCode(LoginResultDTO.NO_SUCH_USER);
            return  loginResultDTO;
        }
        System.out.println(member.getMemPw());
        if (pw.equals(member.getMemPw())){
            System.out.println("usrlogin:" + member.getMemName());
            loginResultDTO.setCode(LoginResultDTO.SUCCESS);
            loginResultDTO.setUid(member.getMemId());
            request.getSession().setAttribute("uid",member.getMemId());
        }else{
            loginResultDTO.setCode(LoginResultDTO.WRONG_PW);
        }
        return  loginResultDTO;
    }
}
