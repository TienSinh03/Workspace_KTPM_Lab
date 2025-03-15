/**
 * @ (#) Observer.java      3/15/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/15/2025
 */
public interface Observer {
    public void update();
    //attach with subject to observe
    public void setSubject(Subject sub);
}
