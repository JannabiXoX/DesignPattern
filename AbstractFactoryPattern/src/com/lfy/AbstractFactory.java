package com.lfy;

/**
 * @Author:feiyang
 * @Date:7/30/2023 8:59 PM
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
