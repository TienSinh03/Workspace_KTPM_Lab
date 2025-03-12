/**
 * @ (#) Test.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit;

import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.strategy.ConsumptionTax;
import vn.edu.iuh.fit.strategy.Special_LuxuryTax;
import vn.edu.iuh.fit.strategy.VAT;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class Test {
    public static void main(String[] args) {
        // Tạo sản phẩm với các loại thuế khác nhau
        Product product1 = new Product(1000,"Iphone 16 Plus", 1000, new VAT());
        Product product2 = new Product(1001,"Mì tôm", 500, new ConsumptionTax());
        Product product3 = new Product(1002, "Xe Bentley", 50000, new Special_LuxuryTax());

        // In thông tin sản phẩm
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
