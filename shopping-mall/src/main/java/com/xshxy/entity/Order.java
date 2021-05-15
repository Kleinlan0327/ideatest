package com.xshxy.entity;

import java.util.Date;

/**
 * @author ls
 * @date 2021/5/15 - 15:18
 */
public class Order {
    private String orderId;
    private User user;
    private Double total;
    private Date orderDate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", user=" + user +
                ", total=" + total +
                ", orderDate=" + orderDate +
                '}';
    }
}
