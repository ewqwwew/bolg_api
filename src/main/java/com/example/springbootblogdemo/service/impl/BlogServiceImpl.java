package com.example.springbootblogdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootblogdemo.pojo.Blog;
import com.example.springbootblogdemo.service.BlogService;
import com.example.springbootblogdemo.mapper.BlogMapper;
import org.springframework.stereotype.Service;

/**
* @author 周杰伦
* @description 针对表【blog(博客表)】的数据库操作Service实现
* @createDate 2024-05-18 19:24:51
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
    implements BlogService{

}




