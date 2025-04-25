/**
 * @ (#) Tomato.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.pizza.concrete_decorator;

import vn.edu.iuh.fit.gk.decorator.pizza.Pizza;
import vn.edu.iuh.fit.gk.decorator.pizza.PizzaDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Tomato extends PizzaDecorator {
    double price;
    public Tomato(Pizza pizza,double price) {
        super(pizza);
        this.price = price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "and add tomato discovery on surface pizza";
    }

    @Override
    public double getCost() {
        System.out.println("Price Tomato: " + price);
        return super.getCost() + price;
    }
}
