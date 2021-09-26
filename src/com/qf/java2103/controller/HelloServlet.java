package com.qf.java2103.controller;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author Cjl
 * @date 2021/6/17 14:22
 */
public class HelloServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("开始");
        String servletName = servletConfig.getServletName();
        System.out.println("servletName = " + servletName);

        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println("servletContext = " + servletContext);

        String name = servletConfig.getInitParameter("name");
        System.out.println("name = " + name);
        String password = servletConfig.getInitParameter("password");
        System.out.println("password = " + password);

        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String s = initParameterNames.nextElement();
            System.out.println(s+":"+servletConfig.getInitParameter(s));
        }



    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("第一个Servlet!!!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("结束");
    }
}
