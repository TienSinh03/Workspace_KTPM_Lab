/**
 * @ (#) DeliveredOrderState.java      3/12/2025
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
public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng: " + order.getId() + " đã được giao thành công.");
    }

}
