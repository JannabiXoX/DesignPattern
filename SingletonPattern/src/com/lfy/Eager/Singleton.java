package com.lfy.Eager;

/**
 *
 * 缺点：类加载时就初始化，浪费内存。
 * @Author:feiyang
 * @Date:7/30/2023 9:59 PM
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
    public void showMessage(){
        System.out.println("Singleton Eager");
    }
}
