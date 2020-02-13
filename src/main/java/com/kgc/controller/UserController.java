package com.kgc.controller;

import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class UserController extends BaseController{
    @Resource
    private UserService userService;


    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/view/getUserById")
    public Result getUserById(@RequestParam Integer id){
        User user = userService.getUserById(id);
        if(user != null){
            return new Result(user,"获取用户信息成功",100);
        }
        return new Result(null,"获取用户信息失败",104);
    }

    @PostMapping("/uploadPic")
    public Result uploadPic(User user,@RequestParam(value = "userpic") MultipartFile multipartFile)throws IOException {
        if(multipartFile != null && !multipartFile.isEmpty()){
            String fileName = uploadFile(multipartFile);
            //文件名上传到数据库
            user.setUserPic(fileName);
        }
        int count = userService.updUserData(user);
        if(count > 0){
            return new Result(null,"资料修改成功",100);
        }
        return new Result(null,"资料修改失败",104);
    }
    /**
     * 用户资料修改
     * @param user
     * @return
     */
    @PostMapping("/view/updUserData")
    public Result updUserData(User user) {
        int count = userService.updUserData(user);
        if(count > 0){
            return new Result(null,"资料修改成功",100);
        }
        return new Result(null,"资料修改失败",104);
    }
}
