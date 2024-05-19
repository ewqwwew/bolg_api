package com.example.springbootblogdemo.controller;

import com.example.springbootblogdemo.mapper.UserMapper;
import com.example.springbootblogdemo.pojo.User;
import com.example.springbootblogdemo.service.UserService;
import com.example.springbootblogdemo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: UserController
 * Package: com.example.springbootblogdemo.controller
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/5/18 21:26
 */
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    //注册
    @PostMapping("regist")
    public Result regist(@RequestBody User user){
        Result result= userService.regist(user);
        return result;
    }
}
