package com.singleton;

public class Singleton {
    public static Singleton instance=null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();
        System.out.println(obj);
        System.out.println(obj2);

    }
}
