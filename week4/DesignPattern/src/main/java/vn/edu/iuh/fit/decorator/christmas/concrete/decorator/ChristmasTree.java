/**
 * @ (#) ChristmasTree.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.christmas.concrete.decorator;

import vn.edu.iuh.fit.decorator.christmas.Christmas;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class ChristmasTree implements Christmas {
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}
