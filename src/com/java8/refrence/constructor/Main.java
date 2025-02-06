package com.java8.refrence.constructor;

public class Main {
    public static void main(String[] args) {
        RefDemo aNew = Constructor::new;

        Constructor display = aNew.display();
        display.show();

    }
}
