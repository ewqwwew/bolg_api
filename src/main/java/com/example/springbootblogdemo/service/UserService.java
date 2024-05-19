package com.example.springbootblogdemo.service;

import com.example.springbootblogdemo.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootblogdemo.utils.Result;

/**
* @author 周杰伦
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-05-18 19:24:51
*/
public interface UserService extends IService<User> {

    //注册接口
    Result regist(User user);
}
