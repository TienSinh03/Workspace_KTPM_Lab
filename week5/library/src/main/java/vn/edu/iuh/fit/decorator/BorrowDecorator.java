/**
 * @ (#) BorrowDecorator.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class BorrowDecorator implements Borrow{
    protected Borrow borrow;

    public BorrowDecorator(Borrow borrow) {
        this.borrow = borrow;
    }
    @Override
    public String borrowBook() {
        return this.borrow.borrowBook();
    }
}
