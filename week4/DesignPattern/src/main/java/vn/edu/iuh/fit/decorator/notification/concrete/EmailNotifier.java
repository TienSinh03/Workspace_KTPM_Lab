/**
 * @ (#) EmailNotifier.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.notification.concrete;

import vn.edu.iuh.fit.decorator.notification.Notifier;
import vn.edu.iuh.fit.decorator.notification.NotifierDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class EmailNotifier extends NotifierDecorator
{
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
        super.send(message);
    }
}
