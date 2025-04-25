/**
 * @ (#) Testing.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.method;

import vn.edu.iuh.fit.gk.bank.factory.method.model.TPBank;
import vn.edu.iuh.fit.gk.bank.factory.method.model.ViettinBank;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class Testing {
    public static void main(String[] args) {
        BankFactory bankFactory = new BankFactory();
        System.out.println(BankFactory.create("ViettinBank", new ViettinBank("ViettinBank")));
        System.out.println(BankFactory.create("TPBank", new TPBank("TPBank")));
    }
}
