/**
 * @ (#) TeamMember.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.employee.concrete;

import vn.edu.iuh.fit.gk.decorator.employee.EmployeeDecorator;
import vn.edu.iuh.fit.gk.decorator.employee.Employee;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class TeamMember extends EmployeeDecorator {

    public TeamMember(Employee employee) {
        super(employee);
    }

    public void reportTask(){
        System.out.println("Team Member reporting");
    }

    public void coordinateWithOthers(){
        System.out.println("Team Member coordinating with others");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }

}
