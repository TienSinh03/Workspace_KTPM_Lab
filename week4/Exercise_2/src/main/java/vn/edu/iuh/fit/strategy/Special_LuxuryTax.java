/**
 * @ (#) Special_LuxuryTax.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class Special_LuxuryTax implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.25; // 20 - 30% thuế đối với sản phẩm xa xỉ
    }
}
