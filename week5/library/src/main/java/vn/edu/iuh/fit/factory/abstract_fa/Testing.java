/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.abstract_fa;

import vn.edu.iuh.fit.models.Book;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {

    public static void main(String[] args) {
        BookAbsFactory factory = new PageBookFactory("Java", "Sinh", "IUH", 2025);
        Book book = BookFactory.createBookFactory(factory);
        book.display();

        factory = new PhysicalBookFactory("Java", "Sinh", "IUH", 2025);
        book = BookFactory.createBookFactory(factory);
        book.display();

    }
}
