package com.bdqn.t28.kytms_manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.t28.kytms_manager.dao")
public class KytmsManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KytmsManagerApplication.class, args);
    }

}
