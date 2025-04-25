/**
 * @ (#) Subject.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.notification;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(String message);
}
