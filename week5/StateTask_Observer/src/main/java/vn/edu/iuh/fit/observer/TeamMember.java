/**
 * @ (#) TeamMember.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public class TeamMember implements Observer{
    private final String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("Team Member " + name + " received update: " +
                "Task '" + taskName + "' is now " + status);
    }
}
