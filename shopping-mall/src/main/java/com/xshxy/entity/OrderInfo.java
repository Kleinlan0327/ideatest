package com.xshxy.entity;

/**
 * @author ls
 * @date 2021/5/15 - 15:24
 */
public class OrderInfo {
    private Integer id;
    private Order order;
    private Product product;
    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", number=" + number +
                '}';
    }
}
