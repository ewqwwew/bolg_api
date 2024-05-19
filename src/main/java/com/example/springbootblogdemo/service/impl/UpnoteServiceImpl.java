package com.example.springbootblogdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootblogdemo.pojo.Upnote;
import com.example.springbootblogdemo.service.UpnoteService;
import com.example.springbootblogdemo.mapper.UpnoteMapper;
import org.springframework.stereotype.Service;

/**
* @author 周杰伦
* @description 针对表【upnote(点赞表)】的数据库操作Service实现
* @createDate 2024-05-18 19:24:51
*/
@Service
public class UpnoteServiceImpl extends ServiceImpl<UpnoteMapper, Upnote>
    implements UpnoteService{

}




