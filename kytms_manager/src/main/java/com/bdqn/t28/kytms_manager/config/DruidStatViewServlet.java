package com.bdqn.t28.kytms_manager.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.Servlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid控制台过滤器，支持设置账号和密码访问登录
 */
@WebServlet(
        urlPatterns = {"/druid/*"},
        initParams = {
                @WebInitParam(name = "allow",value = ""),
                @WebInitParam(name = "loginUsername",value = "admin"),
                @WebInitParam(name = "loginPassword",value = "admin"),
                @WebInitParam(name = "resetEnable",value = "false")
        }
)
public class DruidStatViewServlet extends StatViewServlet implements Servlet {


}
