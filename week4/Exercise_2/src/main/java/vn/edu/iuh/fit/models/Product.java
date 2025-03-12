/**
 * @ (#) Product.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.models;

import vn.edu.iuh.fit.strategy.TaxStrategy;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class Product {
    private long id;
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(long id, String name, double price, TaxStrategy taxStrategy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getTotalTax() {
        return this.price + this.taxStrategy.calculateTax(this.price);
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = #" + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", tax = " + taxStrategy.calculateTax(price) +
                ", total = "  + getTotalTax();
    }

}
