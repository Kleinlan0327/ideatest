package com.xshxy.dao.impl;

import com.xshxy.dao.UserDao;
import com.xshxy.entity.User;
import com.xshxy.util.JdbcUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author ls
 * @date 2021/5/14 - 15:52
 */
public class UserDaoImpl implements UserDao {

    JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();

    @Override
    public List<User> selectAll() {

        return null;
    }

    @Override
    public User selectById() {
        return null;
    }

    @Override
    public User selectByUsername(String username) {
        return null;
    }

    @Override
    public boolean insert(User user) {
        return jdbcTemplate.update("insert into tbl_user(username,name,password,email,gender,birthday) values (?,?,?,?,?,?)",
                                    user.getUsername(),
                                    user.getName(),
                                    user.getPassword(),
                                    user.getEmail(),
                                    user.getGender(),
                                    user.getBirthday()) == 1;
    }
}
