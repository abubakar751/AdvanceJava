package com.java8.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateSumEven {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        
        int x = 3, y = 5;
        System.out.println(isSumEven.test(x, y));  // Output: true
    }
}
