/**
 * @ (#) Subject.java      3/15/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;


/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/15/2025
 */
public interface Subject {
    public void register(Observer observer);
    public void notifyObservers();

    public Object getUpdate(Observer observer);


}
