/**
 * @ (#) DiscountFixed.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class DiscountFixed implements PromotionStrategy{
    @Override
    public double discount(double price) {
        return price - 50000;
    }
}
