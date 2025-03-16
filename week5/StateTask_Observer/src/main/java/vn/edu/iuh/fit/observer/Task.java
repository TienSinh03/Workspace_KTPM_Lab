/**
 * @ (#) Task.java      3/16/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/16/2025
 */
public class Task implements Subject{

    private List<Observer> observers;
    private String taskName;
    private String status;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
        this.observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(taskName, status);
        }
    }
}
