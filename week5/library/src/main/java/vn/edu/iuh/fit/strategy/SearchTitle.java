/**
 * @ (#) SearchTitle.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.strategy;

import vn.edu.iuh.fit.models.Book;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class SearchTitle implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().contains(keyword))
                .collect(Collectors.toList());
    }
}
