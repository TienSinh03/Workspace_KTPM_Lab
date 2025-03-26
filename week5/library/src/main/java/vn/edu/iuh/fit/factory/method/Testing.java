/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.method;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {


        BookFactory.createBook("Physical", "Java", "Sinh", "IUH", 2025).display();
        BookFactory.createBook("Page", "React", "Sinh", "IUH", 2025).display();

    }
}
