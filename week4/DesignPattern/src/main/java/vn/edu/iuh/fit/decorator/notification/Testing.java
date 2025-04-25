/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.notification;

import vn.edu.iuh.fit.decorator.notification.concrete.BasicNotifier;
import vn.edu.iuh.fit.decorator.notification.concrete.EmailNotifier;
import vn.edu.iuh.fit.decorator.notification.concrete.SMSNotifier;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();

        System.out.println("Basic Notifier vs SMS Notifier");
        Notifier smsNotifier = new SMSNotifier(notifier);
        smsNotifier.send("Hello sms");

        System.out.println("Basic Notifier vs Email Notifier");
        Notifier emailNotifier = new EmailNotifier(notifier);
        emailNotifier.send("Hello email");

        System.out.println("Basic Notifier vs SMS Notifier vs Email Notifier");
        Notifier notifier1 = new SMSNotifier(new EmailNotifier(notifier));
        notifier1.send("Hello sms and email");

    }
}
