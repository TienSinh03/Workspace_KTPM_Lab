/**
 * @ (#) MatchSubject.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.matchnews;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class MatchSubject implements Subject{
    String matchName;
    private List<Observer> observers;

    public MatchSubject(String matchName) {
        this.matchName = matchName;
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if(observers == null) throw  new NullPointerException("Null");
        if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String matchInfo) {
        matchInfo = matchName +", " + matchInfo;
        for (Observer observer: observers) {
            observer.update(matchInfo);
        }
    }

    public void newMatch(String updateNews) {
        System.out.println("Cap nhat tran dau: " + updateNews);
        this.notify(updateNews);
    }
}
