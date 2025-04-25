/**
 * @ (#) PlasticFactory.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.bank.factory.abstract_s;

import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.Chair;
import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.PlasticChair;
import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.Table;
import vn.edu.iuh.fit.gk.bank.factory.abstract_s.model.TablePlastic;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class PlasticFactory implements FurnitureAbsFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new TablePlastic();
    }
}
