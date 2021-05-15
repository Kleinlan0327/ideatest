package com.xshxy.dao;

import com.xshxy.entity.User;

import java.util.List;

/**
 * @author ls
 * @date 2021/5/14 - 15:52
 */
public interface UserDao {
    public List<User> selectAll();
    public User selectById();
    public User selectByUsername(String username);
    public boolean insert(User user);
}
