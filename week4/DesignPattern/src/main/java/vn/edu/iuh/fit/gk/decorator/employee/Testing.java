/**
 * @ (#) Testing.java      3/27/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.decorator.employee;

import vn.edu.iuh.fit.gk.decorator.employee.concrete.BasicEmployee;
import vn.edu.iuh.fit.gk.decorator.employee.concrete.TeamLeader;
import vn.edu.iuh.fit.gk.decorator.employee.concrete.TeamMember;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/27/2025
 */
public class Testing {
    public static void main(String[] args) {
        BasicEmployee basicEmployee = new BasicEmployee();
        basicEmployee.doTask();

        System.out.println("====================================");
        TeamMember teamMember = new TeamMember(basicEmployee);
        teamMember.doTask();
        System.out.println("====================================");

        TeamLeader teamLeader = new TeamLeader(teamMember);
        teamLeader.doTask();


    }
}
