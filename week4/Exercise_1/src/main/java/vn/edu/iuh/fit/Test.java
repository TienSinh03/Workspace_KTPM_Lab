/**
 * @ (#) Test.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit;

import vn.edu.iuh.fit.models.Order;
import vn.edu.iuh.fit.state.NewOrderState;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class Test {
    public static void main(String[] args) {
        Order order1 = new Order(1234);
        System.out.println("## Đơn hàng: " + order1.getId());
        // Trạng thái ban đầu của đơn hàng
        order1.handleOrder();
        // Đơn hàng đã được chuyển sang trạng thái xử lý
        order1.handleOrder();
        // Đơn hàng đã được chuyển sang trạng thái giao hàng thành công
        order1.handleOrder();
        order1.cancelOrder();

        System.out.println("\n--------------------------------------------------\n");
        Order order2 = new Order(1234);
        System.out.println("## Đơn hàng: " + order2.getId());
        // Trạng thái ban đầu của đơn hàng
        order2.handleOrder();
        order2.cancelOrder();
        order2.handleOrder();

    }
}
