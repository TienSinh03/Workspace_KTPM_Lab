/**
 * @ (#) ProcessingOrderState.java      3/12/2025
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
public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng: " + order.getId() + " đang được xử lý đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState());
        System.out.println("Đơn hàng: " + order.getId() + " đã được vận chuyển và được chuyển sang trạng thái tiếp theo.");
    }

}
