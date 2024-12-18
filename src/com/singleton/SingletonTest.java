package com.singleton;

public class SingletonTest {
    private static SingletonTest instance;
    private  SingletonTest(){}
    private static SingletonTest getInstance(){
        if (instance==null) instance = new SingletonTest();
        return instance;
    }
    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
