package com.xshxy.dao;

import com.xshxy.entity.Order;

import java.util.List;

/**
 * @author
 * @date 2021/5/16
 */
public interface OrderDao {
    public List<Order> selectAll();
    public Order selectById(String OrderId);
    public boolean insertOne(Order order);

}
