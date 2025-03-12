/**
 * @ (#) Test.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.deractor;

import vn.edu.iuh.fit.deractor.extend.DiscountDecorator;
import vn.edu.iuh.fit.deractor.extend.ProcessingFeeDecorator;
import vn.edu.iuh.fit.deractor.payments.CreditCardPayment;
import vn.edu.iuh.fit.deractor.payments.PaypalPayment;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class Test {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();

        System.out.println("Pay by Credit Card with Processing Fee:");
        Payment creditWithFee = new ProcessingFeeDecorator(creditCardPayment);
        creditWithFee.pay(1000);

        System.out.println("\nPay by PayPal với discount code:");
        Payment paypalWithDiscount = new DiscountDecorator(paypalPayment);
        paypalWithDiscount.pay(1000);

        System.out.println("\nPay by both Credit Card and PayPal and discount code:");
        Payment creditWithFeeAndDiscount = new DiscountDecorator(new ProcessingFeeDecorator(creditCardPayment));
        creditWithFeeAndDiscount.pay(100);
    }
}
