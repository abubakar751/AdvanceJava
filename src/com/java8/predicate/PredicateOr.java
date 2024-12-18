package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateOr {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> lessThanThree = num -> num < 3;
        
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (isEven.or(lessThanThree).test(num)) {
                filteredNumbers.add(num);
            }
        }
        
        System.out.println(filteredNumbers);  // Output: [1, 2, 4, 6]
    }
}
