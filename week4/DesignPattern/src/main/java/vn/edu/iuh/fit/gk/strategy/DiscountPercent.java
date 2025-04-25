/**
 * @ (#) DiscountPercent.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class DiscountPercent implements PromotionStrategy{
    double discount;

    public DiscountPercent(double discount) {
        this.discount = discount;
    }

    @Override
    public double discount(double price) {
        return price - price*discount;
    }
}
