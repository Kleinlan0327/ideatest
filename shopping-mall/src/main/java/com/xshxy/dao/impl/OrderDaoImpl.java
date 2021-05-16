package com.xshxy.dao.impl;

import com.xshxy.dao.OrderDao;
import com.xshxy.entity.Order;
import com.xshxy.util.JdbcUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author
 * @date 2021/5/16
 */
public class OrderDaoImpl implements OrderDao {

    JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();

    @Override
    public List<Order> selectAll() {
        return null;
    }

    @Override
    public Order selectById(String OrderId) {
        return null;
    }

    @Override
    public boolean insertOne(Order order) {
        return false;
    }
}
