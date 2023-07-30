package com.lfy.lazy.lazyTheadSafe;

/**
 *
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @Author:feiyang
 * @Date:7/30/2023 9:56 PM
 */
public class Singleton {

    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Singleton lazy thread safe");
    }
}
