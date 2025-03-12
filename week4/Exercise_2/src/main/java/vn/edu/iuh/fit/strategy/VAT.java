/**
 * @ (#) VAT.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class VAT implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // 5% thuế đối với sản phẩm thiết yếu
    }
}
