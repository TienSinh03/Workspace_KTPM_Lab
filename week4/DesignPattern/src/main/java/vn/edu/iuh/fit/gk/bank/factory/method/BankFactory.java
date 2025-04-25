/**
 * @ (#) BankFactory.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.method;

import vn.edu.iuh.fit.gk.bank.factory.method.model.Bank;
import vn.edu.iuh.fit.gk.bank.factory.method.model.TPBank;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class BankFactory {
    public static Bank create(String type, Bank bank) {
        if(type.equals("ViettinBank")) {
            return new TPBank(bank.getBankName());
        } else if (type.equals("TPBank")) {
            return new TPBank(bank.getBankName());
        }
        return null;
    }
}
