package com.atguigu.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("放行前。。。。。");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("放行后.........");
    }

    @Override
    public void destroy() {
        System.out.println("结束了");
    }
}
