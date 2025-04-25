/**
 * @ (#) RobotState.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.state.robot;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public interface RobotState {
    void walk(Robot robot);
    void cook(Robot robot);
    void off(Robot robot);
}
