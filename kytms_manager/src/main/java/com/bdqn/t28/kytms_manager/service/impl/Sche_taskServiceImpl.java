package com.bdqn.t28.kytms_manager.service.impl;


import com.bdqn.t28.kytms_manager.dao.Sche_TaskDao;
import com.bdqn.t28.kytms_manager.pojo.Sche_task;
import com.bdqn.t28.kytms_manager.service.Sche_taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sche_taskServiceImpl implements Sche_taskService {

    @Autowired(required = false)
    private Sche_TaskDao sche_TaskMapper;

    @Override
    public List<Sche_task> queryAll() {
        List<Sche_task> userList = sche_TaskMapper.selectList(null);
        return userList;
    }
}
