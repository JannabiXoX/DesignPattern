package com.lfy.inner;

/**
 * @Author:feiyang
 * @Date:7/30/2023 10:33 PM
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
