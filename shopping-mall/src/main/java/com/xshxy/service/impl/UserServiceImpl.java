package com.xshxy.service.impl;

import com.xshxy.dao.UserDao;
import com.xshxy.dao.impl.UserDaoImpl;
import com.xshxy.entity.User;
import com.xshxy.service.UserService;

import java.util.List;

/**
 * @author ls
 * @date 2021/5/14 - 15:53
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectById() {
        return null;
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.selectByUsername(username);
        return user != null && password.equals(user.getPassword()) ? user : null;
    }

    @Override
    public boolean register(User user) {
        return userDao.insert(user);
    }
}
