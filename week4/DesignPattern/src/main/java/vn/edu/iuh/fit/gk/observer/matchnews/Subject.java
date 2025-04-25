/**
 * @ (#) Subject.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.matchnews;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notify(String matchInfo);
}
