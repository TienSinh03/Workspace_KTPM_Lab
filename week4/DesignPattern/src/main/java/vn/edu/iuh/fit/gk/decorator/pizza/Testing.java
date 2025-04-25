/**
 * @ (#) Testing.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.pizza;

import vn.edu.iuh.fit.gk.decorator.pizza.concrete_decorator.Cheese;
import vn.edu.iuh.fit.gk.decorator.pizza.concrete_decorator.Tomato;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Testing {
    public static void main(String[] args) {
        PizzaConcreteBasic pizza = new PizzaConcreteBasic("Pizza ngon ",  1000);
        System.out.println("Pizza Basic");
        System.out.println("Description: "+ pizza.getDescription());
        System.out.println("Total Price " + pizza.getCost());


        PizzaDecorator cheese = new Cheese(pizza, 120);
        System.out.println("Pizza Cheese");
        System.out.println("Description: "+ cheese.getDescription());
        System.out.println("Total Price: " + cheese.getCost());

        PizzaDecorator tomato = new Tomato(pizza,180);
        System.out.println("Pizza Tomato");
        System.out.println("Description: "+ tomato.getDescription());
        System.out.println("Total Price: " + tomato.getCost());


        PizzaDecorator tomatoandcheese = new Tomato(cheese,180);
        System.out.println("Pizza Tomato and Cheese");
        System.out.println("Description: "+ tomatoandcheese.getDescription());
        System.out.println("Total Price: " + tomatoandcheese.getCost());
    }
}
