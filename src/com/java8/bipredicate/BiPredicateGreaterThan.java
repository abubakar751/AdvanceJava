package com.java8.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateGreaterThan {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isGreaterThan = (a, b) -> a > b;
        
        int x = 10, y = 5;
        System.out.println(isGreaterThan.test(x, y));  // Output: true
    }
}
