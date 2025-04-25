/**
 * @ (#) Testing.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.state.robot;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Testing {
    public static void main(String[] args) {
        Robot robot = new Robot("Robot Silas 02");

        //state
        robot.walk();
        robot.cook();
        robot.off();
        robot.cook();
        robot.walk();
        robot.off();
        robot.cook();
    }
}
