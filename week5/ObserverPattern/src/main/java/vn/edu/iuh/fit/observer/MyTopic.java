/**
 * @ (#) MyTopic.java      3/15/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/15/2025
 */
public class MyTopic implements Subject {
    private List<vn.edu.iuh.fit.observer.Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");

        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        if (!changed) return;

        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer observer : observersLocal) {
            observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic:" + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
