package com.offcn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.demo123.User;
import com.offcn.demo123.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired 本地注入
    @Reference(timeout = 3000) // 远程调用
    UserService userService;

    @GetMapping("/all")
    public List<User> all(){
        return userService.getUserList();
    }
}
