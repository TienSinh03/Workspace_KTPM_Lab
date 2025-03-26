/**
 * @ (#) PageBookFactory.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.abstract_fa;

import vn.edu.iuh.fit.models.Book;
import vn.edu.iuh.fit.models.PageBook;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class PageBookFactory extends Book implements BookAbsFactory{

    public PageBookFactory(String title, String author, String publisher, int year) {
        super(title, author, publisher, year);
    }

    @Override
    public void display() {
        System.out.println("Page Book: " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getPublisher() + " - " + this.getYear());
    }

    @Override
    public Book createBook() {
        return new PageBook(this.getTitle(), this.getAuthor(), this.getPublisher(), this.getYear());
    }
}
