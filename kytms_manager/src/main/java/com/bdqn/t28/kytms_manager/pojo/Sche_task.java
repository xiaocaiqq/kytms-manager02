package com.bdqn.t28.kytms_manager.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("sche_task")
public class Sche_task {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("message")
    private String message;
    @TableField("task_excute_time")
    private Date task_excute_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTask_excute_time() {
        return task_excute_time;
    }

    public void setTask_excute_time(Date task_excute_time) {
        this.task_excute_time = task_excute_time;
    }
}
