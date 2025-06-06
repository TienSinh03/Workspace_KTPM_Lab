/**
 * @ (#) NewOrderState.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.state;

import vn.edu.iuh.fit.models.Order;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class NewOrderState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng: " + order.getId() + " đã được tạo mới.");
        order.setState(new ProcessingOrderState());
        System.out.println("Đơn hàng: " + order.getId() + " đã được chuyển sang trạng thái xử lý.");
    }

}
