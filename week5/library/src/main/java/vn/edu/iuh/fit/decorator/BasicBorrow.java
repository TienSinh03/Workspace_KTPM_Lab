/**
 * @ (#) BasicBorrow.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class BasicBorrow implements Borrow{

    String bookName;

    public BasicBorrow(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String borrowBook() {
        return "Borrowed: " + bookName;
    }
}
