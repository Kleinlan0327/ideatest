package com.xshxy.dao.impl;

import com.xshxy.dao.OrderInfoDao;
import com.xshxy.entity.OrderInfo;
import com.xshxy.util.JdbcUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author
 * @date 2021/5/16
 */
public class OrderInfoDaoImpl implements OrderInfoDao {

    JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();

    @Override
    public List<OrderInfo> selectAll() {
        return null;
    }

    @Override
    public OrderInfo selectById(String OrderId) {
        return null;
    }

    @Override
    public boolean insertOne(OrderInfo orderInfo) {
        return false;
    }
}
