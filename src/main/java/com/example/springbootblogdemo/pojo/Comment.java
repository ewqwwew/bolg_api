package com.example.springbootblogdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName comment
 */
//@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    @TableId
    private Integer tid;

    private String commentText;

    private Integer blogId;

    private Integer userId;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}