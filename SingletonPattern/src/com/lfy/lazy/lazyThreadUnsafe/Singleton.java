package com.lfy.lazy.lazyThreadUnsafe;

/**
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * @Author:feiyang
 * @Date:7/30/2023 9:52 PM
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Singleton lazy thread unsafe");
    }
}
