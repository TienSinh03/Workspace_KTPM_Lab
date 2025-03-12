/**
 * @ (#) DiscountDecorator.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.deractor.extend;

import vn.edu.iuh.fit.deractor.Payment;
import vn.edu.iuh.fit.deractor.PaymentDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double discount = 0.2; // 20% discount
        System.out.println("Discount: " + discount*100 + " %");
        super.pay(amount - amount * discount);
    }
}
