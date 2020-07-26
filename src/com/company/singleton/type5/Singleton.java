package com.company.singleton.type5;

//饿汉式(静态内部类)
public class Singleton {
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
