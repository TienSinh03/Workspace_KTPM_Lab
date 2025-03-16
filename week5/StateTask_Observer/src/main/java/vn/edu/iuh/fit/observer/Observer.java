/**
 * @ (#) Observer.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public interface Observer {
    public void update(String taskName, String status);
}
