package com.kgc.controller;

import com.alibaba.fastjson.JSONObject;
import com.kgc.pojo.User;
import com.kgc.pojo.ValidateCode;
import com.kgc.service.UserService;
import com.kgc.service.ValidateCodeService;
import com.kgc.utils.Md5Encrypt;
import com.kgc.utils.Result;
import com.kgc.utils.SendValidateCode;
import org.hibernate.validator.constraints.EAN;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
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
import java.text.ParseException;
import java.time.Duration;
import java.util.Date;
import java.util.UUID;

@RestController
public class LoginController extends BaseController {
    @Resource
    private UserService userService;
    @Resource
    private ValidateCodeService validateCodeService;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;


    /**
     * 根据手机验证码修改密码
     * @param phone
     * @param code
     * @return
     */
    @PostMapping("/updatePwdAsPhone")
    public Result updatePwdAsPhone(@RequestParam String phone,@RequestParam String code,@RequestParam String userPassword) throws ParseException {
        //查询验证码是否存在
        ValidateCode validateCode = validateCodeService.selectCodeIsExist(code);
        if(validateCode != null) {
            //时间在5分钟之内
            if (getTime(validateCode.getDate(), new Date()) <= 5) {
                Integer id = null;
                //查询手机号是否存在
                User user = userService.selectUSerByPhone(phone);
                //对验证码进行清除
                validateCodeService.deleteByCode(code);

                if (user != null) {  //存在,修改密码
                    user.setUserPassword(Md5Encrypt.md5(userPassword));
                    int count = userService.updUserData(user);

                    if (count > 0) {  //修改成功
                        return new Result(null, "修改成功", 100);
                    }
                    return new Result(null, "修改失败", 104);
                } else { //不存在
                    return new Result(null, "该手机号未注册", 104);
                }
            }
        }
        return new Result(null,"验证码错误",104);
    }

    /**
     * 查询验证码和手机号是否存在
     * 验证码是否过期
     * 没问题进行登录
     * @param phone
     * @param code
     * @return
     * @throws ParseException
     */
    @PostMapping("/selectPhoneAndCode")
    public Result selectPhoneAndCode(@RequestParam String phone, @RequestParam String code, HttpServletResponse response) throws ParseException, UnsupportedEncodingException {
        //查询验证码是否存在
        ValidateCode validateCode = validateCodeService.selectCodeIsExist(code);
        if(validateCode != null){
            //时间在5分钟之内
            if(getTime(validateCode.getDate(),new Date()) <= 5) {

                Integer id = null;
                //查询手机号是否存在
                User user = userService.selectUSerByPhone(phone);
                if(user !=null){ //存在
                    id = user.getId();
                }else{ //不存在则注册
                    User user1 = new User();
                    user1.setUserPhone(phone);
                    user1.setUserRole("普通用户");
                    int count = userService.addUser(user1);
                    if(count <= 0){
                        return new Result(null,"自动注册失败，请重试",104);
                    }
                    //注册成功 已开启自动生成主键
                    id = user1.getId();
                }
                //进行登录
                User user2 = userService.getUserById(id);

                //对验证码进行清除
                validateCodeService.deleteByCode(code);

                if (user2 != null) {
                    //生成token令牌
                    String token = UUID.randomUUID()+"";
                    //把token令牌存入redis
                    redisTemplate.opsForValue().set(token,user2,Duration.ofMinutes(30L));

                    return new Result(token, "登录成功", 100);
                }else{
                    return new Result(null, "登录失败", 104);
                }
            }
        }
        return new Result(null,"验证码错误",104);
    }



    /**
     * 手机号注册发送短信
     * @param phone
     * @return
     */
    @GetMapping("/sendValidateCode")
    public Result sendValidateCode(String phone){
        String code = (int)((Math.random()*9+1)*100000)+"";
        boolean flag = SendValidateCode.send(phone,code,"LTAI4Fjweq5oHXYnpXyYkGEX","lzFWWXdg27hMpDHuOBennMW6Ffhach");
        if(flag){//发送成功
            ValidateCode validateCode = new ValidateCode();
            validateCode.setValidateCode(code);
            validateCode.setDate(new Date());
            //存入数据库
            validateCodeService.InsertValidateCode(validateCode);
            return new Result(null,"已发送",100);
        }
        return new Result(null,"发送失败,请重试",104);
    }

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    public Result addUser(User user){
        //默认为普通用户
        user.setUserRole("普通用户");
        //md5加密
        if(user.getUserPassword() != null){
            user.setUserPassword(Md5Encrypt.md5(user.getUserPassword()));
        }
        int count = userService.addUser(user);
        if(count > 0 ){
            return new Result(null,"注册成功",100);
        }
        return new Result(null,"注册失败,请重新注册",104);
    }

    /**
     * 退出登录
     * @return
     */
    @GetMapping("/view/logOut")
    public Result logOut(HttpServletRequest request){
        //获取token令牌
        String token = request.getHeader("token");
        //将token令牌从redis中删除
        Boolean delete = redisTemplate.delete(token);

        return new Result(delete,"已退出",100);
    }

    /**
     * 查看redis是否有用户
     * @return
     */
    @GetMapping("/view/getUserOfLogin")
    public Result getUserOfLogin(HttpServletRequest request) throws UnsupportedEncodingException {
        //获取token令牌
        String token = request.getHeader("token");
        //从redis查询用户
        Object user = redisTemplate.opsForValue().get(token);
        if(user != null ){
            return new Result(user,"获取登录用户成功",100);
        }
        return new Result(null,"获取登录用户失败",104);
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     * @throws UnsupportedEncodingException
     */
    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password) throws UnsupportedEncodingException {
        User user = userService.getUserOfLogin(username, Md5Encrypt.md5(password));
        if(user != null){
            //生成token令牌
            String token = UUID.randomUUID()+"";
            //存入redis
            redisTemplate.opsForValue().set(token,user, Duration.ofMinutes(30L));

            return new Result(token,"登录成功！",100);
        }
        return new Result(null,"用户或密码错误！",102);
    }
}
