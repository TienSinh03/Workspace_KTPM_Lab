/**
 * @ (#) DiscountFreeShip.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class DiscountFreeShip implements PromotionStrategy{

    private double shippingCost; // Phí vận chuyển mặc định

    public DiscountFreeShip(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    @Override
    public double discount(double price) {
        return price - shippingCost;
    }
}
