/**
 * @ (#) PhysicalBook.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.models;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class PhysicalBook extends Book{

    public PhysicalBook(String title, String author, String publisher, int year) {
        super(title, author, publisher, year);
    }

    @Override
    public void display() {
        System.out.println("PhysicalBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}');
    }
}
