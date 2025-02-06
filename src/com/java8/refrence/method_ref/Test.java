package com.java8.refrence.method_ref;

public class Test {

        public static void thread() throws InterruptedException {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i*2);
            Thread.sleep(1000);
        }
    }
}
