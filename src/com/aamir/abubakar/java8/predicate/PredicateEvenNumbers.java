package com.aamir.abubakar.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (isEven.test(num)) {
                evenNumbers.add(num);
            }
        }
        
        System.out.println(evenNumbers);  // Output: [2, 4, 6]
    }
}
