package com.example.springbootblogdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName upnote
 */
//@TableName(value ="upnote")
@Data
public class Upnote implements Serializable {
    @TableId
    private Integer uid;

    private Integer blogId;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}