/**
 * @ (#) Testing.java      3/28/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.matchnews;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/28/2025
 */
public class Testing {
    public static void main(String[] args) {
        MatchSubject sub = new MatchSubject("Liverpool vs Man City");

        Observer user1 = new User("Sinh", "03615154");
        Observer user2 = new User("Linh", "0354841");

        sub.register(user1);
        sub.register(user2);

        sub.newMatch("Liverpool ghi bàn! Tỉ số 1-0");
        sub.newMatch("Man City ghi bàn go hoa! Tỉ số 1-1");

        sub.unregister(user2);

        sub.newMatch("Man City ghi bàn! Tỉ số 1-2");
    }
}
