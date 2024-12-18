package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateAnd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> greaterThanThree = num -> num > 3;
        
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (isEven.and(greaterThanThree).test(num)) {
                filteredNumbers.add(num);
            }
        }
        
        System.out.println(filteredNumbers);  // Output: [4, 6]
    }
}
