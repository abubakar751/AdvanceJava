package com.aamir.abubakar.java8.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEqualNumbers {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);
        
        int x = 7, y = 7;
        System.out.println(isEqual.test(x, y));  // Output: true
    }
}
