/**
 * @ (#) Bank.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.method.model;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public abstract class Bank {
    public abstract String getBankName();

    @Override
    public String toString() {
        return "Bank Name: " + getBankName();
    }
}
