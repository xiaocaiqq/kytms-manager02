package com.bdqn.t28.kytms_manager.controller;


import com.bdqn.t28.kytms_manager.pojo.Sche_task;
import com.bdqn.t28.kytms_manager.service.Sche_taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Sche_taskController {


    @Autowired
    private Sche_taskService sche_taskService;

    @GetMapping("/query")
    public List<Sche_task> query(){
        return sche_taskService.queryAll();
    }
}
