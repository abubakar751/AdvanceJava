package com.aamir.abubakar.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        // Supplier that generates a random integer
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(87);

        // Get and print a random integer
        Integer randomInt = randomIntegerSupplier.get();
        System.out.println("Random Integer: " + randomInt);
    }
}
