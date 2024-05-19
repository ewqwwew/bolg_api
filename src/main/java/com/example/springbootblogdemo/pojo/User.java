package com.example.springbootblogdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user
 */
//@TableName(value ="user")
@Data
public class User implements Serializable {
    @TableId
    private Integer id;

    private String username;

    private String password;

    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}