/**
 * @ (#) TreeTopper.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.christmas.concrete.extend;

import vn.edu.iuh.fit.decorator.christmas.Christmas;
import vn.edu.iuh.fit.decorator.christmas.ChristmasTreeDecorator;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class TreeTopper extends ChristmasTreeDecorator {
    public TreeTopper(Christmas christmas) {
        super(christmas);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with Tree Topper";
    }
}
