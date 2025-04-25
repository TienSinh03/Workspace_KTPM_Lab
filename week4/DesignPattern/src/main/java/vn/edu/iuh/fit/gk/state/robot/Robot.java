/**
 * @ (#) Robot.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.state.robot;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Robot {
    private String name;
    private RobotState state;

    public Robot(String name) {
        this.name = name;
        this.state = new RobotOffState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RobotState getState() {
        return state;
    }

    public void setState(RobotState state) {
        this.state = state;
    }

    public void walk() {
        this.state.walk(this);
    }

    public void cook() {
        this.state.cook(this);
    }

    public void off() {
        this.state.off(this);
    }
}
