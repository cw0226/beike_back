package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.utils.FtpUtil;
import com.kgc.utils.Md5Encrypt;
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
     * 根据id删除用户
     * @param id
     * @return
     */
    @GetMapping("/view/deleteUserById")
    public Result deleteUserById(@RequestParam Integer id){
        int count = userService.deleteUserById(id);
        if(count > 0){
            return new Result(count,"删除成功",100);
        }
        return new Result(null,"删除失败",104);
    }

    /**
     * 获取所有用户信息
     * 传入id除了id本身
     * @return
     */
    @GetMapping("/view/getAllUserInfo")
    public Result getAllUserInfo(@RequestParam Integer pageNum,@RequestParam Integer pageSize,Integer id){
        PageInfo<User> pageInfo = userService.getAllUserInfo(pageNum,pageSize,id);
        if(pageInfo != null){
            return new Result(pageInfo,"获取用户列表成功",100);
        }
        return new Result(null,"获取用户列表失败",104);
    }

    /**
     * 查询手机号是否存在
     * @param phone
     * @return
     */
    @GetMapping("/view/selectPhoneisExist")
    public Result selectPhoneisExist(String phone){
        User user = userService.selectUSerByPhone(phone);
        if(user != null){
            return new Result(user,"手机号已存在",100);
        }
        return new Result(null,"手机号不存在",104);
    }

    /**
     * 根据用户名查询用户是否存在
     * @param name
     * @return
     */
    @GetMapping("/selectUserByName")
    public Result selectUserByName(String name){
        User user = userService.selectUserByName(name);
        if(user != null){
            return new Result(user,"用户存在",100);
        }
        return new Result(null,"用户不存在",104);
    }

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/view/getUserById")
    public Result getUserById(@RequestParam Integer id,String oldPwd){
        User user = userService.getUserById(id);
        if(user != null){
            if(oldPwd != null){
                if(user.getUserPassword().equals(Md5Encrypt.md5(oldPwd))){
                    return new Result(null,"旧密码正确",200);
                }
            }
            return new Result(user,"获取用户信息成功",100);
        }
        return new Result(null,"获取用户信息失败",104);
    }

    /**
     * 用户资料修改
     * @param user
     * @param multipartFile
     * @return
     */
    @PostMapping("/view/updUserData")
    public Result updUserData(User user,@RequestParam(value = "userpic",required = false)MultipartFile multipartFile) throws IOException {
        if(multipartFile != null && !multipartFile.isEmpty()){
            //上传文件到ftp服务器
            String fileName = FtpUtil.uploadFile(multipartFile);
            if(fileName != null){
                //文件名上传到数据库
                user.setUserPic(fileName);
            }
        }
        if(user.getUserPassword() != null){
            //md5加密
            user.setUserPassword(Md5Encrypt.md5(user.getUserPassword()));
        }
        int count = userService.updUserData(user);
        if(count > 0){
            return new Result(null,"资料修改成功",100);
        }
        return new Result(null,"资料修改失败",104);
    }
}
