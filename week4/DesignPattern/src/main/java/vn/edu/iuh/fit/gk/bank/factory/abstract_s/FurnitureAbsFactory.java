/**
 * @ (#) FurnitureAbsFactory.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.abstract_s;

import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.Chair;
import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.Table;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public interface FurnitureAbsFactory {
    public Chair createChair();
    public Table createTable();
}
