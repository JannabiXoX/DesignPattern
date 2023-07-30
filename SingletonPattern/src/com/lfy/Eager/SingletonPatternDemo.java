package com.lfy.Eager;




/**
 * @Author:feiyang
 * @Date:7/30/2023 9:50 PM
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取唯一可用的对象
        Singleton object = Singleton.getInstance();

        object.showMessage();
    }
}
