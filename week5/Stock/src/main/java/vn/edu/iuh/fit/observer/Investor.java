/**
 * @ (#) Investor.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public class Investor implements Observer{
    private final String nameInvestor;

    public Investor(String nameInvestor) {
        this.nameInvestor=nameInvestor;
    }

    @Override
    public void update(String nameStock, double priceStock) {
        System.out.println("Investor " + nameInvestor + " received update: " +
                "Stock " + nameStock + " is now $" + priceStock);
    }
}
