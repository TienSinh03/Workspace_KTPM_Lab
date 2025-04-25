/**
 * @ (#) Order.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Order {
    String orderName;
    double price;
    PromotionStrategy strategy;

    public Order(String orderName, double price) {
        this.orderName = orderName;
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PromotionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyDiscount(double price) {
        if(strategy == null) {
            return price;
        }
        return strategy.discount(price);
    }
}
