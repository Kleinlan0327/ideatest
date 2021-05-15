package com.xshxy.servlet;

import com.xshxy.entity.User;
import com.xshxy.service.UserService;
import com.xshxy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ls
 * @date 2021/5/15 - 17:28
 */
@WebServlet("/user/login")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        UserService userService = new UserServiceImpl();
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.login(username, password);
        if(user != null){
            session.setAttribute("user",user);
            response.sendRedirect("index.jsp");
        }else {
            request.setAttribute("message","用户名或密码错误，请重新输入");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
