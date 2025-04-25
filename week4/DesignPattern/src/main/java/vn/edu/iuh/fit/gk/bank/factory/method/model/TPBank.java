/**
 * @ (#) TPBank.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.method.model;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class TPBank extends Bank{
    String name;

    public TPBank(String name) {
        this.name = name;
    }
    @Override
    public String getBankName() {
        return this.name;
    }
}
