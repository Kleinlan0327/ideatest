package com.xshxy.servlet;

import com.xshxy.entity.User;
import com.xshxy.service.UserService;
import com.xshxy.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;


/**
 * @author ls
 * @date 2021/5/15 - 16:48
 */
@WebServlet("/user/register")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        UserService userService = new UserServiceImpl();
        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userService.register(user))
            response.sendRedirect(request.getContextPath()+"/user-login.jsp");
        else {
            request.setAttribute("message","注册失败！");
            request.getRequestDispatcher("user-register.jsp").forward(request,response);
        }
    }
}
