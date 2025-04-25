/**
 * @ (#) Testing.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Testing {
    public static void main(String[] args) {
        Order discountContext = new Order("order 1", 500000);

        // Áp dụng giảm giá 10%
        discountContext.setStrategy(new DiscountPercent(0.1));
        System.out.println("Giá sau giảm 10%: " + discountContext.applyDiscount(discountContext.getPrice()) + " VND");

        // Áp dụng giảm giá cố định 50.000đ
        discountContext.setStrategy(new DiscountFixed());
        System.out.println("Giá sau giảm 50.000đ: " + discountContext.applyDiscount(discountContext.getPrice()) + " VND");

        // Áp dụng miễn phí vận chuyển với phí 30.000đ
        discountContext.setStrategy(new DiscountFreeShip(30000));
        System.out.println("Giá sau miễn phí vận chuyển (30.000đ): " + discountContext.applyDiscount(discountContext.getPrice()) + " VND");
    }
}

