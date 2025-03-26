/**
 * @ (#) BookFactory.java      3/26/2025
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
public class BookFactory {
   public static Book createBookFactory(BookAbsFactory factory) {
       return factory.createBook();
   }
}
