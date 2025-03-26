/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.observer;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        Subject library = new LibrarySubject();

        Observer librarian1 = new Librarian("Alice");
        Observer librarian2 = new Librarian("Bob");
         library.registerObserver(librarian1);
         library.registerObserver(librarian2);

         library.addBook("Design Patterns");
         library.returnBook("Design Patterns");

         library.removeObserver(librarian1);
         library.addBook("Refactoring");
    }
}
