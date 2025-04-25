/**
 * @ (#) Testing.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.christmas;

import vn.edu.iuh.fit.decorator.christmas.concrete.decorator.ChristmasTree;
import vn.edu.iuh.fit.decorator.christmas.concrete.extend.BubbleLight;
import vn.edu.iuh.fit.decorator.christmas.concrete.extend.Tinsel;
import vn.edu.iuh.fit.decorator.christmas.concrete.extend.TreeTopper;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class Testing {
    public static void main(String[] args) {
        Christmas christmas = new ChristmasTree();

        System.out.println(christmas.decorate());
        Christmas tinsel = new Tinsel(christmas);
        System.out.println(tinsel.decorate());

        System.out.println("=====================================");
        Christmas treeTopper = new TreeTopper(tinsel);
        System.out.println(treeTopper.decorate());

        System.out.println("=====================================");
        Christmas bubbleLight = new BubbleLight(treeTopper);
        System.out.println(bubbleLight.decorate());




    }
}
