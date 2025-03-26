/**
 * @ (#) Librarian.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Librarian implements Observer
{
    private String name;

    public Librarian(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Librarian " + name + " received notification: " + message);
    }
}
