package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class UserController {
       @RequestMapping("/add")
       @ResponseBody
        public User add(){
           User user=new User();
           user.setName("张三");
           return user;
        }
}
