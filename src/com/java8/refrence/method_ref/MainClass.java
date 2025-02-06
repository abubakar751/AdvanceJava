package com.java8.refrence.method_ref;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Deff deff=Test::thread;
                deff.m();
    }
}
