package com.bdqn.t28.kytms_manager.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid过滤器
 */
@WebFilter(
        filterName = "druidWebStatFilter",
        urlPatterns = { "/*" },
        initParams = {
        @WebInitParam(
        name = "exclusions",
        value = "*.js,*.jpg,*.png,*.gif,*.ico,*.css,/druid/*")}
)
public class DruidStatFilter extends WebStatFilter {
}
