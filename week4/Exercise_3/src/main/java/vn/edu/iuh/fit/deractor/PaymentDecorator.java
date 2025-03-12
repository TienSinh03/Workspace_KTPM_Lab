/**
 * @ (#) PaymentDecorator.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.deractor;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class PaymentDecorator implements Payment{
    protected Payment payment;

    public PaymentDecorator(Payment payment){
       this.payment = payment;
    }

    @Override
    public void pay(double amount) {
        this.payment.pay(amount);
    }
}
