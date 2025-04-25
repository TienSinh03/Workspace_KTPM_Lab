/**
 * @ (#) BasicNotifier.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.notification.concrete;

import vn.edu.iuh.fit.decorator.notification.Notifier;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending: " + message);
    }
}
