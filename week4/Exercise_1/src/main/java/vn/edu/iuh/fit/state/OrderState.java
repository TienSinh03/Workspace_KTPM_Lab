/**
 * @ (#) OrderState.java      3/12/2025
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
public interface OrderState {

    void handleOrder(Order order);
}
