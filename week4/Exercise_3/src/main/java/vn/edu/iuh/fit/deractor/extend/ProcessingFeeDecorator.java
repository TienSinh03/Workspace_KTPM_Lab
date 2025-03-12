/**
 * @ (#) ProcessingFeeDecorator.java      3/12/2025
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
public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.03; // 3% phí xử lý
        System.out.println("Processing fee: " + fee + " $");
        super.pay(amount + fee);
    }
}
