package com.xshxy.service;

import com.xshxy.entity.User;

import java.util.List;

/**
 * @author ls
 * @date 2021/5/14 - 15:53
 */
public interface UserService {
    public List<User> selectAll();
    public User selectById();
    public User login(String username, String password);
    public boolean insert(User user);
}
