/**
 * @ (#) BasicEmployee.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.employee.concrete;

import vn.edu.iuh.fit.gk.decorator.employee.Employee;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class BasicEmployee implements Employee {
    @Override
    public void doTask() {
        System.out.println("Basic Employee does task");
    }

    @Override
    public void join() {
        System.out.println("Basic Employee joined");
    }

    @Override
    public void terminate() {
        System.out.println("Basic Employee terminated");
    }
}
