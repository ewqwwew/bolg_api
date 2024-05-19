package com.example.springbootblogdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootblogdemo.pojo.User;
import com.example.springbootblogdemo.service.UserService;
import com.example.springbootblogdemo.mapper.UserMapper;
import com.example.springbootblogdemo.utils.MD5Util;
import com.example.springbootblogdemo.utils.Result;
import com.example.springbootblogdemo.utils.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 周杰伦
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-05-18 19:24:51
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result regist(User user) {
        LambdaQueryWrapper<User> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getUsername,user.getUsername());

        Long count = userMapper.selectCount(lambdaQueryWrapper);
        if(count>0){
            return Result.build(null, ResultCodeEnum.USERNAME_USED);
        }
        user.setPassword(MD5Util.encrypt(user.getPassword()));

        userMapper.insert(user);

        return Result.ok(null);

    }
}




