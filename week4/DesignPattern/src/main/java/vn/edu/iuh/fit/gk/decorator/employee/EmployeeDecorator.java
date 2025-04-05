/**
 * @ (#) EmployeeDecorator.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.employee;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class EmployeeDecorator implements Employee{
   protected  Employee employee;

  public EmployeeDecorator(Employee employee){
       this.employee = employee;
    }

    @Override
    public void doTask() {
        this.employee.doTask();
    }

    @Override
    public void join() {
        this.employee.doTask();
    }

    @Override
    public void terminate() {
        this.employee.doTask();
    }
}
