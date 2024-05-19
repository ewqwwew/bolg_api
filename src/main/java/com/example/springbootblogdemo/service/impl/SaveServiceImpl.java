package com.example.springbootblogdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootblogdemo.pojo.Save;
import com.example.springbootblogdemo.service.SaveService;
import com.example.springbootblogdemo.mapper.SaveMapper;
import org.springframework.stereotype.Service;

/**
* @author 周杰伦
* @description 针对表【save(收藏表)】的数据库操作Service实现
* @createDate 2024-05-18 19:24:51
*/
@Service
public class SaveServiceImpl extends ServiceImpl<SaveMapper, Save>
    implements SaveService{

}




