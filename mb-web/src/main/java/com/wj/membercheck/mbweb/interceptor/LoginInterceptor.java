package com.wj.membercheck.mbweb.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        System.out.println("当前访问地址: " + url);
        if(url.contains("login") || url.contains("error")){
            return true;
        }
        HttpSession session = request.getSession();
        Object object = session.getAttribute("uid");
        System.out.println("读取session得到的id: " + object);
        if(object != null){
            return true;
        }

        System.out.println("用户尚未登入");
        response.sendError(401);
        return false;
    }
}
