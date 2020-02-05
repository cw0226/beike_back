package com.kgc.filter;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.kgc.utils.Result;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/view/*"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //Filter过滤器跨域处理
        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        boolean flag = false;
        //判断是否有Cookie
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length >0 ){
            for (Cookie cookie: cookies){
                String name = cookie.getName();
                String value = cookie.getValue();
                if("USER".equals(name) && !StringUtils.isEmpty(value)){
                    flag = true;
                    filterChain.doFilter(servletRequest,servletResponse);
                    break;
                }
            }
        }
        if(!flag){
            //未登录
            String data = JSON.toJSONString(new Result(null,"未登录",103));
            response.setContentType("json/text;charset=utf-8");
            PrintWriter out =response.getWriter();

            out.write(data);
        }
    }

    @Override
    public void destroy() {

    }
}
