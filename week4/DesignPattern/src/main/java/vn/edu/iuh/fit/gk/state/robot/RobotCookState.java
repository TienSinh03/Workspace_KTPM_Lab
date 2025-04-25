/**
 * @ (#) RobotCookState.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.state.robot;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class RobotCookState implements RobotState {
    @Override
    public void walk(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " di chuyen");
        robot.setState(new RobotOnState());
    }

    @Override
    public void cook(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " tiep tuc nau an");

    }

    @Override
    public void off(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " khong the tat khi dang nau an");
    }
}
