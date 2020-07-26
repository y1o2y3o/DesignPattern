package com.company.singleton.type2;

//饿汉式(静态代码快)
public class Singleton {
    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
