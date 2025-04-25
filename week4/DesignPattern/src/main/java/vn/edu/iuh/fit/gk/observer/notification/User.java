/**
 * @ (#) User.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.notification;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("User " + name + " received notification: " + message);
    }
}
