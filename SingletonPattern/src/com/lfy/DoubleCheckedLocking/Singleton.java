package com.lfy.DoubleCheckedLocking;

/**
 *
 *  采用双锁机制，安全且在多线程情况下能保持高性能。
 *  getInstance() 的性能对应用程序很关键。
 * @Author:feiyang
 * @Date:7/30/2023 10:01 PM
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public void showMessage(){
        System.out.println("Singleton  double-checked locking");
    }
}
