/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.gk.observer.notification;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        Subject notificationSystem = new Notification();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Đăng ký người dùng vào hệ thống thông báo
        notificationSystem.registerObserver(user1);
        notificationSystem.registerObserver(user2);
        notificationSystem.registerObserver(user3);

        // Gửi thông báo
        System.out.println("=== Gửi thông báo đầu tiên ===");
        notificationSystem.notifyObserver("Có tin nhắn mới!");

        // Bỏ đăng ký một người dùng và gửi lại thông báo
        notificationSystem.removeObserver(user2);
        System.out.println("\n=== Gửi thông báo thứ hai (sau khi Bob rời đi) ===");
        notificationSystem.notifyObserver("Hệ thống sẽ bảo trì vào lúc 23:00!");
    }
}
