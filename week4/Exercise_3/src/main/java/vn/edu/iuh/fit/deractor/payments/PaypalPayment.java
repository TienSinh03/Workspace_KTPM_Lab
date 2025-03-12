/**
 * @ (#) CreditCardPayment.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.deractor.payments;

import vn.edu.iuh.fit.deractor.Payment;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class PaypalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with paypal: " + amount);
    }
}
