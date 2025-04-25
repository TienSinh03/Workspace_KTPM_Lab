/**
 * @ (#) RobotOnState.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.state.robot;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class RobotOnState implements RobotState{

    @Override
    public void walk(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " co the di chuyen");
    }

    @Override
    public void cook(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " bat dau nau an");
        robot.setState(new RobotCookState());
    }

    @Override
    public void off(Robot robot) {
        System.out.println("Robot "+ robot.getName() + " nhan le tat");
        robot.setState(new RobotOffState());
    }
}
