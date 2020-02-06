package com.kgc.controller;

import com.alibaba.fastjson.JSONObject;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
public class LoginController {
    @Resource
    private UserService userService;


    /**
     * 退出登录
     * @return
     */
    @GetMapping("/view/logOut")
    public Result logOut(HttpServletResponse response){
        Cookie cookie = new Cookie("USER","");
        cookie.setPath("/");
        cookie.setMaxAge(1);
        response.addCookie(cookie);
        return new Result(null,"已退出",100);
    }

    /**
     * 查看Cookie是否有用户
     * @return
     */
    @GetMapping("/view/getUserOfLogin")
    public Result getUserOfLogin(HttpServletRequest request) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length >0) {
            for (Cookie cookie: cookies) {
                if("USER".equals(cookie.getName())){
                    String user =URLDecoder.decode(cookie.getValue(),"UTF-8");
                    return new Result(user,"Cookie获取成功",100);
                }
            }
        }
        return new Result(null,"Cookie未获取到",104);
    }

    /**
     * 登录
     * @param username
     * @param password
     * @param response
     * @return
     * @throws UnsupportedEncodingException
     */
    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) throws UnsupportedEncodingException {
        User user = userService.getUserOfLogin(username,password);
        if(user != null){
            //转为json格式再转码
            String fastJson = JSONObject.toJSONString(user);
            fastJson = URLEncoder.encode(fastJson,"UTF-8");

            //将用户存入Cookie
            Cookie cookie = new Cookie("USER",fastJson);
            cookie.setPath("/");
            cookie.setMaxAge(60*30);
            response.addCookie(cookie);

            return new Result(user,"登录成功！",100);
        }
        return new Result(null,"用户或密码错误！",102);
    }
}
