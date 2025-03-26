/**
 * @ (#) LibrarySearch.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

import vn.edu.iuh.fit.models.Book;

import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class LibrarySearch {
    private SearchStrategy searchStrategy;

    public LibrarySearch(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public List<Book> search(List<Book> books, String keyword) {
        return searchStrategy.search(books, keyword);
    }
}
