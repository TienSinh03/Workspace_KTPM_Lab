/**
 * @ (#) Notification.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.notification;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Notification implements Subject{
    List<Observer> observers;

    public Notification() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) {
            throw new NullPointerException("Null Observer");
        }

        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer obs : observers){
            obs.update(message);
        }
    }
}
