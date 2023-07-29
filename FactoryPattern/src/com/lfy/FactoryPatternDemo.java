package com.lfy;

/**
 * @Author:feiyang
 * @Date:7/29/2023 4:58 PM
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape shape_Circle = shapeFactory.getShape("CIRCLE");
        shape_Circle.draw();

        //获取Rectangle的对象，并调用它的draw方法
        Shape shape_Rectangle = shapeFactory.getShape("RECTANGLE");
        shape_Rectangle.draw();

        //获取Square的对象，并调用它的draw方法
        Shape shape_Square = shapeFactory.getShape("SQUARE");
        shape_Square.draw();

    }
}
