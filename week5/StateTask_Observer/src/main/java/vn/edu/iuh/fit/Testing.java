/**
 * @ (#) Testing.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit;

import vn.edu.iuh.fit.observer.Observer;
import vn.edu.iuh.fit.observer.Task;
import vn.edu.iuh.fit.observer.TeamMember;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public class Testing {
    public static void main(String[] args) {
        Task task = new Task("Develop Login Feature", "To do");

        Observer team1 = new TeamMember("Team1");
        Observer team2 = new TeamMember("Team2");

        task.register(team1);
        task.register(team2);

        System.out.println("Updating task status...");
        task.setStatus("In Progress");

        task.unRegister(team1);
        System.out.println("Updating task status again...");
        task.setStatus("Completed");
    }


}
