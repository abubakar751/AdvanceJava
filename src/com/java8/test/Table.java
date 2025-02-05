package com.java8.test;

public class Table {
    public static void main(String[] args) {
        int number=3;
       Runnable runnable=()-> {
            try {
                for (int i = 1   ; i <=10 ; i++) {
                    System.out.println(number * i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
