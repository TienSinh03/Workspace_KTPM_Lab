/**
 * @ (#) Order.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.models;

import vn.edu.iuh.fit.state.CancelOrderState;
import vn.edu.iuh.fit.state.NewOrderState;
import vn.edu.iuh.fit.state.OrderState;
import vn.edu.iuh.fit.state.ProcessingOrderState;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */

public class Order {
    private final long id;
    private OrderState state;

    public Order(long id) {
        this.id = id;
        this.state = new NewOrderState();
    }

    /**
     * Nếu đơn hàng đang trong quá trình xử lý thì có thể hủy đơn hàng
     * Nếu không thì không thể hủy đơn hàng
     */
    public void cancelOrder() {
        if (state instanceof ProcessingOrderState) {
            state = new CancelOrderState();
            state.handleOrder(this);
        } else {
            System.out.println("Không thể hủy đơn hàng ở trạng thái hiện tại.");
        }
    }

    /**
     * Xử lý đơn hàng
     * Nếu đơn hàng ở trạng thái đã bị hủy thì không thể tiếp tục xử lý
     * Nếu không thì tiếp tục xử lý đơn hàng
     */
    public void handleOrder() {
        if (state instanceof CancelOrderState) {
            System.out.println("Đơn hàng ở trạng thái bị hủy -> không thể tiếp tục xử lý.");
        } else {
            state.handleOrder(this);
        }
    }


    public void setState(OrderState state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }
}
