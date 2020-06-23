package com.cn.youyi.controller;


import com.cn.youyi.entity.User;
import com.cn.youyi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;

    @Transactional
    @RequestMapping("selectUserByUid")
    public String SelecUserByUid(int uid, Model model){
        User user = userService.getUserById(uid);
        model.addAttribute("user", user);
        return "index";
    }

}
