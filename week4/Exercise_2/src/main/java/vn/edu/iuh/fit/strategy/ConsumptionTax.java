/**
 * @ (#) ConsumptionTax.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class ConsumptionTax implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.1; // 10% tax
    }
}
