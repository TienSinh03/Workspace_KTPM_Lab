/**
 * @ (#) TeamLeader.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.employee.concrete;

import vn.edu.iuh.fit.gk.decorator.employee.Employee;
import vn.edu.iuh.fit.gk.decorator.employee.EmployeeDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class TeamLeader extends EmployeeDecorator {
    public TeamLeader(Employee employee) {
        super(employee);
    }



    public void planing(){
        System.out.println("Team Leader planning");
    }

    public void motivate(){
        System.out.println("Team Leader motivating");
    }

    public void monitor(){
        System.out.println("Team Leader monitoring");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
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
