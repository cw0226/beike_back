package com.kgc.controller;

import com.kgc.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    private UserService userService;


}
