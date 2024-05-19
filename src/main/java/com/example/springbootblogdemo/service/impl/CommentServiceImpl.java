package com.example.springbootblogdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootblogdemo.pojo.Comment;
import com.example.springbootblogdemo.service.CommentService;
import com.example.springbootblogdemo.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author 周杰伦
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2024-05-18 19:24:51
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




