package com.example.demo01.controller;

import com.example.demo01.entity.User;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiahao
 * @create 2020-06-28 13:18
 */
//@Controller
@RestController
public class HelloController {
    //@Autowired
    //private UserService userService;


    @RequestMapping("/")
    public String getHello() {
        //return "demo01";
        return "ok";
    }


}
