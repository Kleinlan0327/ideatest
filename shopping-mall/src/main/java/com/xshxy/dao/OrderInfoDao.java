package com.xshxy.dao;


import com.xshxy.entity.OrderInfo;
import java.util.List;

/**
 * @author
 * @date 2021/5/16
 */
public interface OrderInfoDao {
    public List<OrderInfo> selectAll();
    public OrderInfo selectById(String OrderId);
    public boolean insertOne(OrderInfo orderInfo);
}
