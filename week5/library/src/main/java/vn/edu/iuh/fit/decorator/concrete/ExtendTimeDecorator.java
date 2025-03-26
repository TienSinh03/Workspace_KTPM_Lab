/**
 * @ (#) ExtendTimeDecorator.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.concrete;

import vn.edu.iuh.fit.decorator.Borrow;
import vn.edu.iuh.fit.decorator.BorrowDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class ExtendTimeDecorator extends BorrowDecorator {
    public ExtendTimeDecorator(Borrow borrow) {
        super(borrow);
    }

    @Override
    public String borrowBook() {
        return super.borrowBook() + " and extend time";
    }
}
