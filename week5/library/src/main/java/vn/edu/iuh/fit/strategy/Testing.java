/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

import vn.edu.iuh.fit.models.Book;
import vn.edu.iuh.fit.models.PageBook;
import vn.edu.iuh.fit.models.PhysicalBook;

import java.util.Arrays;
import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new PageBook("The Hobbit", "J.R.R. Tolkien", "Fantasy", 295),
                new PageBook("1984", "George Orwell", "Dystopian", 295),
                new PageBook("To Kill a Mockingbird", "Harper Lee", "Classic", 295),
                new PhysicalBook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 295),
                new PhysicalBook("Brave New World", "Aldous Huxley", "Dystopian", 295)
        );

        LibrarySearch searchTitle = new LibrarySearch(new SearchTitle());
        searchTitle.search(books, "The").forEach(Book::display);

        LibrarySearch searchAuthor = new LibrarySearch(new SearchAuthor());
        searchAuthor.search(books, "Al").forEach(Book::display);


    }

}
