package com.example.springbootblogdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName blog
 */
//@TableName(value ="blog")
@Data
public class Blog implements Serializable {
    @TableId
    private Integer bid;

    private String title;

    private String article;

    private String author;

    private Integer commentNum;

    private String comment;

    private Integer upnoteNum;

    private Integer saveNum;

    private Date createTime;

    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}