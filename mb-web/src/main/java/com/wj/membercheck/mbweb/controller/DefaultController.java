package com.wj.membercheck.mbweb.controller;

import com.wj.membercheck.biz.service.MemberService;
import com.wj.membercheck.mbdao.model.MemberDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by white_wolf on 2019/10/7.
 *
 * @author thebestwj
 */
@Controller
@CrossOrigin
public class DefaultController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/amember")
    public MemberDO amember(){
        return memberService.findById(1);
    }

    @ResponseBody
    @RequestMapping("/allmembers/{role}")
    public List<MemberDO> allmembers(@PathVariable @NotNull String role){
        return memberService.findAllByRole(role);
    }

    @ResponseBody
    @PostMapping(value = "/addmember")
    public int addMember(@NotNull @RequestBody(required = true) MemberDO memberDO){
        System.out.println(memberDO.getMemName());
        int newid =memberService.addOne(memberDO);
        System.out.println(newid);
        return newid;
    }

    @ResponseBody
    @PostMapping(value = "/deletemember/{id}")
    public int deleteMember(@PathVariable("id") int id){
        return memberService.deleteById(id);
    };
}
