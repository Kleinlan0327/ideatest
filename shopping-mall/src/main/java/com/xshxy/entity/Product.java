package com.xshxy.entity;

/**
 * @author ls
 * @date 2021/5/15 - 15:07
 */
public class Product {
    private Integer productId;
    private String productName;
    private String picture;
    private Double price;
    private String productArea;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", picture='" + picture + '\'' +
                ", price=" + price +
                ", productArea='" + productArea + '\'' +
                '}';
    }
}
