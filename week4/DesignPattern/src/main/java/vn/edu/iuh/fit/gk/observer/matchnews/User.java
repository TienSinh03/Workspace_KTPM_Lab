/**
 * @ (#) User.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.matchnews;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */


public class User implements Observer
{
    String name;
    String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String matchInfo) {
        System.out.println("Gửi SMS tới " + phoneNumber + ": " + matchInfo);
    }
}
