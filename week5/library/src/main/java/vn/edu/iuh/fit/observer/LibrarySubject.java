/**
 * @ (#) LibrarySubject.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class LibrarySubject implements Subject {
    private final List<Observer> observers;

    public LibrarySubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(observer)) {
            observers.add(observer);
        } ;
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

    public void addBook(String bookName) {
        System.out.println("New book added: " + bookName);
        notifyObservers("New book available: " + bookName);
    }

    public void returnBook(String bookName) {
        System.out.println("Book returned: " + bookName);
        notifyObservers("Book returned and available for borrowing: " + bookName);
    }
}
