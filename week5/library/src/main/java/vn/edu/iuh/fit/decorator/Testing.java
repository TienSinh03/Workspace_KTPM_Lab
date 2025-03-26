/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator;

import vn.edu.iuh.fit.decorator.concrete.ExtendTimeDecorator;
import vn.edu.iuh.fit.decorator.concrete.SpecialBook;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        Borrow borrow = new BasicBorrow("Java Programming");

        BorrowDecorator borrowDecorator = new ExtendTimeDecorator(borrow);
        System.out.println(borrowDecorator.borrowBook());

        BorrowDecorator special = new SpecialBook(borrow);
        System.out.println(special.borrowBook());

        BorrowDecorator both = new SpecialBook(borrowDecorator);
        System.out.println(both.borrowBook());
    }
}
