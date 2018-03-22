package com.infoshareacademy.interview;

public class SingletonExample {
    private static SingletonExample INSTANCE = null;

    public synchronized static SingletonExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }

    public enum EnumExample {
        ENUM_INSTANCE;
    }
}
