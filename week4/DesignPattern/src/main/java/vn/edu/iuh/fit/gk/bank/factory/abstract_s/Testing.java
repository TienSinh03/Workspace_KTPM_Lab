/**
 * @ (#) Testing.java      3/27/2025
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
public class Testing {
    public static void main(String[] args) {
        Table factoryTable = FurnitureFactory.createTable(new WoodFactory());
        factoryTable.create();

        Table factoryTable2 = FurnitureFactory.createTable(new PlasticFactory());
        factoryTable2.create();

        Chair factoryChair = FurnitureFactory.createChair(new WoodFactory());
        factoryChair.create();

        Chair factoryChair2 = FurnitureFactory.createChair(new PlasticFactory());
        factoryChair2.create();

    }
}
