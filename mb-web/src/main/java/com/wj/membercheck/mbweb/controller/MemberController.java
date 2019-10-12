package com.wj.membercheck.mbweb.controller;

import com.wj.membercheck.biz.service.MemberService;
import com.wj.membercheck.mbdao.model.MemberDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by white_wolf on 2019/10/8.
 *
 * @author thebestwj
 */
@Controller
@ResponseBody
@Api("成员操作")
@CrossOrigin("http://127.0.0.1:5500")
public class MemberController {

    @Autowired
    MemberService memberService;

    @ApiOperation("获取成员")
    @GetMapping("/member/{id}")
    public MemberDO member(@PathVariable("id")int id){
        return memberService.findById(id);
    }

    @ApiOperation("删除成员")
    @DeleteMapping("/member/{id}")
    public int deleteMember(@PathVariable("id") int id){
        return memberService.deleteById(id);
    };

    @ApiOperation("添加成员")
    @PostMapping(value = "/member")
    public int addMember(@NotNull @RequestBody(required = true) MemberDO memberDO){
        System.out.println(memberDO.getMemName());
        int newid =memberService.addOne(memberDO);
        System.out.println(newid);
        return newid;
    }

    @ApiOperation("获取某类成员")
    @GetMapping("/members/{role}")
    public List<MemberDO> members(@PathVariable @NotNull String role){
        return memberService.findAllByRole(role);
    }
}
