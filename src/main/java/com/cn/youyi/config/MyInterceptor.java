package com.cn.youyi.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//拦截器，登录之后才能操作
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //判断什么情况下放行
        if (session.getAttribute("userLoginInfo")!=null){
            System.out.println(session.getAttribute("userLoginInfo"));
            return true;
        }

//        response.sendRedirect("/WEB-INF/jsp/login.jsp");
        System.out.println(session.getAttribute("userLoginInfo"));
        response.sendRedirect("/yaoyao_war_exploded/user/GOlogin");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
