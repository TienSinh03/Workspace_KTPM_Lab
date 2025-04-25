/**
 * @ (#) ChristmasTreeDecorator.java      3/26/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.decorator.christmas;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/26/2025
 */
public class ChristmasTreeDecorator implements Christmas{
    protected Christmas christmas;

    public ChristmasTreeDecorator(Christmas christmas){
        this.christmas = christmas;
    }
    @Override
    public String decorate() {
        return this.christmas.decorate();
    }
}
