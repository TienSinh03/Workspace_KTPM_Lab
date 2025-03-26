/**
 * @ (#) NotifierDecorator.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.notification;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class NotifierDecorator implements Notifier{
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        this.notifier.send(message);

    }
}
