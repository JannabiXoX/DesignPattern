package com.lfy;

/**
 * @Author:feiyang
 * @Date:7/30/2023 9:46 PM
 */
public class SingleObject {
    //创建StringObject的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
