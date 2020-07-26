package com.company.singleton.type6;

//饿汉式(枚举)
public enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("~ok");
    }
}
