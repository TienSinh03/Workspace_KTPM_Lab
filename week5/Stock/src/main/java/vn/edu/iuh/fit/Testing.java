/**
 * @ (#) Testing.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit;

import vn.edu.iuh.fit.observer.Investor;
import vn.edu.iuh.fit.observer.Observer;
import vn.edu.iuh.fit.observer.Stock;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public class Testing {
    public static void main(String[] args) {

        Stock stock = new Stock("Apple", 133);

        Observer investor1 = new Investor("Teo");
        Observer investor2 = new Investor("Ti");

        // register investor for stock
        stock.register(investor1);
        stock.register(investor2);

        //change price stock
        System.out.println("Updating stock price....");
        stock.setPrice(155);

        System.out.println("Updating stock price again....");
        stock.setPrice(165);
    }
}
