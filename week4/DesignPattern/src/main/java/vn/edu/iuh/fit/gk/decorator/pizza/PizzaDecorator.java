/**
 * @ (#) PizzaDecorator.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.pizza;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public double getCost() {
        return this.pizza.getCost();
    }
}
