/**
 * @ (#) BookAbsFactory.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.method;

import vn.edu.iuh.fit.models.Book;
import vn.edu.iuh.fit.models.PageBook;
import vn.edu.iuh.fit.models.PhysicalBook;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class BookFactory {

    public static Book createBook(String type, String title, String author, String publisher, int year) {
        if ("Physical".equalsIgnoreCase(type)) return new PhysicalBook(title, author, publisher, year);
        else if ("Page".equalsIgnoreCase(type)) return new PageBook(title, author, publisher, year);
        return null;
    }
}
