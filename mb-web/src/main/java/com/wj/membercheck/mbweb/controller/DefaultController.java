package com.wj.membercheck.mbweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by white_wolf on 2019/10/7.
 *
 * @author thebestwj
 */
@Controller
@ResponseBody
public class DefaultController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



}
