/**
 * @ (#) Subject.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
    void addBook(String bookName);
    void returnBook(String bookName);
}
